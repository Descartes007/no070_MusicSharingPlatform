package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlefanchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlefanchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlefanchangView;


/**
 * 音乐翻唱
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface YinlefanchangService extends IService<YinlefanchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlefanchangVO> selectListVO(Wrapper<YinlefanchangEntity> wrapper);
   	
   	YinlefanchangVO selectVO(@Param("ew") Wrapper<YinlefanchangEntity> wrapper);
   	
   	List<YinlefanchangView> selectListView(Wrapper<YinlefanchangEntity> wrapper);
   	
   	YinlefanchangView selectView(@Param("ew") Wrapper<YinlefanchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlefanchangEntity> wrapper);
   	
}

