package com.dao;

import com.entity.DiscusszaixiantinggeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixiantinggeVO;
import com.entity.view.DiscusszaixiantinggeView;


/**
 * 在线听歌评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface DiscusszaixiantinggeDao extends BaseMapper<DiscusszaixiantinggeEntity> {
	
	List<DiscusszaixiantinggeVO> selectListVO(@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);
	
	DiscusszaixiantinggeVO selectVO(@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);
	
	List<DiscusszaixiantinggeView> selectListView(@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);

	List<DiscusszaixiantinggeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);
	
	DiscusszaixiantinggeView selectView(@Param("ew") Wrapper<DiscusszaixiantinggeEntity> wrapper);
	
}
