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


import com.dao.DiscussyinlefanchangDao;
import com.entity.DiscussyinlefanchangEntity;
import com.service.DiscussyinlefanchangService;
import com.entity.vo.DiscussyinlefanchangVO;
import com.entity.view.DiscussyinlefanchangView;

@Service("discussyinlefanchangService")
public class DiscussyinlefanchangServiceImpl extends ServiceImpl<DiscussyinlefanchangDao, DiscussyinlefanchangEntity> implements DiscussyinlefanchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinlefanchangEntity> page = this.selectPage(
                new Query<DiscussyinlefanchangEntity>(params).getPage(),
                new EntityWrapper<DiscussyinlefanchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinlefanchangEntity> wrapper) {
		  Page<DiscussyinlefanchangView> page =new Query<DiscussyinlefanchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyinlefanchangVO> selectListVO(Wrapper<DiscussyinlefanchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyinlefanchangVO selectVO(Wrapper<DiscussyinlefanchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyinlefanchangView> selectListView(Wrapper<DiscussyinlefanchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinlefanchangView selectView(Wrapper<DiscussyinlefanchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
