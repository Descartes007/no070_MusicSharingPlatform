package com.dao;

import com.entity.YinlezixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinlezixunVO;
import com.entity.view.YinlezixunView;


/**
 * 音乐资讯
 * 
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface YinlezixunDao extends BaseMapper<YinlezixunEntity> {
	
	List<YinlezixunVO> selectListVO(@Param("ew") Wrapper<YinlezixunEntity> wrapper);
	
	YinlezixunVO selectVO(@Param("ew") Wrapper<YinlezixunEntity> wrapper);
	
	List<YinlezixunView> selectListView(@Param("ew") Wrapper<YinlezixunEntity> wrapper);

	List<YinlezixunView> selectListView(Pagination page,@Param("ew") Wrapper<YinlezixunEntity> wrapper);
	
	YinlezixunView selectView(@Param("ew") Wrapper<YinlezixunEntity> wrapper);
	
}
