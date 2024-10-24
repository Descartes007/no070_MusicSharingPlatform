package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinlezixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinlezixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinlezixunView;


/**
 * 音乐资讯
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface YinlezixunService extends IService<YinlezixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinlezixunVO> selectListVO(Wrapper<YinlezixunEntity> wrapper);
   	
   	YinlezixunVO selectVO(@Param("ew") Wrapper<YinlezixunEntity> wrapper);
   	
   	List<YinlezixunView> selectListView(Wrapper<YinlezixunEntity> wrapper);
   	
   	YinlezixunView selectView(@Param("ew") Wrapper<YinlezixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinlezixunEntity> wrapper);
   	
}

