package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiantinggeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiantinggeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiantinggeView;


/**
 * 在线听歌
 *
 * @author 
 * @email 
 * @date 2021-01-11 11:34:28
 */
public interface ZaixiantinggeService extends IService<ZaixiantinggeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiantinggeVO> selectListVO(Wrapper<ZaixiantinggeEntity> wrapper);
   	
   	ZaixiantinggeVO selectVO(@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);
   	
   	List<ZaixiantinggeView> selectListView(Wrapper<ZaixiantinggeEntity> wrapper);
   	
   	ZaixiantinggeView selectView(@Param("ew") Wrapper<ZaixiantinggeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiantinggeEntity> wrapper);
   	
}

