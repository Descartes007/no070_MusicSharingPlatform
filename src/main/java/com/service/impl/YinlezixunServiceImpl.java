package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YinlezixunDao;
import com.entity.YinlezixunEntity;
import com.service.YinlezixunService;
import com.entity.vo.YinlezixunVO;
import com.entity.view.YinlezixunView;

@Service("yinlezixunService")
public class YinlezixunServiceImpl extends ServiceImpl<YinlezixunDao, YinlezixunEntity> implements YinlezixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlezixunEntity> page = this.selectPage(
                new Query<YinlezixunEntity>(params).getPage(),
                new EntityWrapper<YinlezixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlezixunEntity> wrapper) {
		  Page<YinlezixunView> page =new Query<YinlezixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlezixunVO> selectListVO(Wrapper<YinlezixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlezixunVO selectVO(Wrapper<YinlezixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlezixunView> selectListView(Wrapper<YinlezixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlezixunView selectView(Wrapper<YinlezixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
