package com.dao;

import com.entity.ZaixiantinggeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiantinggeVO;
import com.entity.view.ZaixiantinggeView;


/**
 * 在线听歌
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface ZaixiantinggeDao extends BaseMapper<ZaixiantinggeEntity> {
	
	List<ZaixiantinggeVO> selectListVO(@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);
	
	ZaixiantinggeVO selectVO(@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);
	
	List<ZaixiantinggeView> selectListView(@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);

	List<ZaixiantinggeView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);
	
	ZaixiantinggeView selectView(@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);
	
}
