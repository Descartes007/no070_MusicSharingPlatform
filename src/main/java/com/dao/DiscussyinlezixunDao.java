package com.dao;

import com.entity.DiscussyinlezixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinlezixunVO;
import com.entity.view.DiscussyinlezixunView;


/**
 * 音乐资讯评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface DiscussyinlezixunDao extends BaseMapper<DiscussyinlezixunEntity> {
	
	List<DiscussyinlezixunVO> selectListVO(@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);
	
	DiscussyinlezixunVO selectVO(@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);
	
	List<DiscussyinlezixunView> selectListView(@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);

	List<DiscussyinlezixunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);
	
	DiscussyinlezixunView selectView(@Param("ew") Wrapper<DiscussyinlezixunEntity> wrapper);
	
}
