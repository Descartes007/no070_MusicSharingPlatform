package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinlefanchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinlefanchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinlefanchangView;


/**
 * 音乐翻唱评论表
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface DiscussyinlefanchangService extends IService<DiscussyinlefanchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinlefanchangVO> selectListVO(Wrapper<DiscussyinlefanchangEntity> wrapper);
   	
   	DiscussyinlefanchangVO selectVO(@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);
   	
   	List<DiscussyinlefanchangView> selectListView(Wrapper<DiscussyinlefanchangEntity> wrapper);
   	
   	DiscussyinlefanchangView selectView(@Param("ew") Wrapper<DiscussyinlefanchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinlefanchangEntity> wrapper);
   	
}

