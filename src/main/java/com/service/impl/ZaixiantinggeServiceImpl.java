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


import com.dao.ZaixiantinggeDao;
import com.entity.ZaixiantinggeEntity;
import com.service.ZaixiantinggeService;
import com.entity.vo.ZaixiantinggeVO;
import com.entity.view.ZaixiantinggeView;

@Service("zaixiantinggeService")
public class ZaixiantinggeServiceImpl extends ServiceImpl<ZaixiantinggeDao, ZaixiantinggeEntity> implements ZaixiantinggeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiantinggeEntity> page = this.selectPage(
                new Query<ZaixiantinggeEntity>(params).getPage(),
                new EntityWrapper<ZaixiantinggeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiantinggeEntity> wrapper) {
		  Page<ZaixiantinggeView> page =new Query<ZaixiantinggeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiantinggeVO> selectListVO(Wrapper<ZaixiantinggeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiantinggeVO selectVO(Wrapper<ZaixiantinggeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiantinggeView> selectListView(Wrapper<ZaixiantinggeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiantinggeView selectView(Wrapper<ZaixiantinggeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
