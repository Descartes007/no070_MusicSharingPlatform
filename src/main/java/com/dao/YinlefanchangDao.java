package com.dao;

import com.entity.YinlefanchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlefanchangVO;
import com.entity.view.YinlefanchangView;


/**
 * 音乐翻唱
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface YinlefanchangDao extends BaseMapper<YinlefanchangEntity> {
	
	List<YinlefanchangVO> selectListVO(@Param("ew") Wrapper<YinlefanchangEntity> wrapper);
	
	YinlefanchangVO selectVO(@Param("ew") Wrapper<YinlefanchangEntity> wrapper);
	
	List<YinlefanchangView> selectListView(@Param("ew") Wrapper<YinlefanchangEntity> wrapper);

	List<YinlefanchangView> selectListView(Pagination page,@Param("ew") Wrapper<YinlefanchangEntity> wrapper);
	
	YinlefanchangView selectView(@Param("ew") Wrapper<YinlefanchangEntity> wrapper);
	
}
