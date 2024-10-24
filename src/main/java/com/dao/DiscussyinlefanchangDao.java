package com.dao;

import com.entity.DiscussyinlefanchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinlefanchangVO;
import com.entity.view.DiscussyinlefanchangView;


/**
 * 音乐翻唱评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface DiscussyinlefanchangDao extends BaseMapper<DiscussyinlefanchangEntity> {
	
	List<DiscussyinlefanchangVO> selectListVO(@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);
	
	DiscussyinlefanchangVO selectVO(@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);
	
	List<DiscussyinlefanchangView> selectListView(@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);

	List<DiscussyinlefanchangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);
	
	DiscussyinlefanchangView selectView(@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);
	
}
