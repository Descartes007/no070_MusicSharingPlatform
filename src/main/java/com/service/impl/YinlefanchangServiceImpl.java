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


import com.dao.YinlefanchangDao;
import com.entity.YinlefanchangEntity;
import com.service.YinlefanchangService;
import com.entity.vo.YinlefanchangVO;
import com.entity.view.YinlefanchangView;

@Service("yinlefanchangService")
public class YinlefanchangServiceImpl extends ServiceImpl<YinlefanchangDao, YinlefanchangEntity> implements YinlefanchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlefanchangEntity> page = this.selectPage(
                new Query<YinlefanchangEntity>(params).getPage(),
                new EntityWrapper<YinlefanchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlefanchangEntity> wrapper) {
		  Page<YinlefanchangView> page =new Query<YinlefanchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlefanchangVO> selectListVO(Wrapper<YinlefanchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlefanchangVO selectVO(Wrapper<YinlefanchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlefanchangView> selectListView(Wrapper<YinlefanchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlefanchangView selectView(Wrapper<YinlefanchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
