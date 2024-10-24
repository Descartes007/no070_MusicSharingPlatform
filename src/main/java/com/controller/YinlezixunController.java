package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YinlezixunEntity;
import com.entity.view.YinlezixunView;

import com.service.YinlezixunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 音乐资讯
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
@RestController
@RequestMapping("/yinlezixun")
public class YinlezixunController {
    @Autowired
    private YinlezixunService yinlezixunService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinlezixunEntity yinlezixun, HttpServletRequest request){
        EntityWrapper<YinlezixunEntity> ew = new EntityWrapper<YinlezixunEntity>();
		PageUtils page = yinlezixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlezixun), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinlezixunEntity yinlezixun, HttpServletRequest request){
        EntityWrapper<YinlezixunEntity> ew = new EntityWrapper<YinlezixunEntity>();
		PageUtils page = yinlezixunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinlezixun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinlezixunEntity yinlezixun){
       	EntityWrapper<YinlezixunEntity> ew = new EntityWrapper<YinlezixunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinlezixun, "yinlezixun")); 
        return R.ok().put("data", yinlezixunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinlezixunEntity yinlezixun){
        EntityWrapper< YinlezixunEntity> ew = new EntityWrapper< YinlezixunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinlezixun, "yinlezixun")); 
		YinlezixunView yinlezixunView =  yinlezixunService.selectView(ew);
		return R.ok("查询音乐资讯成功").put("data", yinlezixunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YinlezixunEntity yinlezixun = yinlezixunService.selectById(id);
        return R.ok().put("data", yinlezixun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YinlezixunEntity yinlezixun = yinlezixunService.selectById(id);
        return R.ok().put("data", yinlezixun);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YinlezixunEntity yinlezixun = yinlezixunService.selectById(id);
        if(type.equals("1")) {
        	yinlezixun.setThumbsupnum(yinlezixun.getThumbsupnum()+1);
        } else {
        	yinlezixun.setCrazilynum(yinlezixun.getCrazilynum()+1);
        }
        yinlezixunService.updateById(yinlezixun);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinlezixunEntity yinlezixun, HttpServletRequest request){
    	yinlezixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlezixun);
        yinlezixunService.insert(yinlezixun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinlezixunEntity yinlezixun, HttpServletRequest request){
    	yinlezixun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinlezixun);
        yinlezixunService.insert(yinlezixun);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YinlezixunEntity yinlezixun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinlezixun);
        yinlezixunService.updateById(yinlezixun);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinlezixunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YinlezixunEntity> wrapper = new EntityWrapper<YinlezixunEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yinlezixunService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
