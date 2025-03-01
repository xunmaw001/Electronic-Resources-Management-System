package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujukuView;


/**
 * 数据库
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ShujukuService extends IService<ShujukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujukuVO> selectListVO(Wrapper<ShujukuEntity> wrapper);
   	
   	ShujukuVO selectVO(@Param("ew") Wrapper<ShujukuEntity> wrapper);
   	
   	List<ShujukuView> selectListView(Wrapper<ShujukuEntity> wrapper);
   	
   	ShujukuView selectView(@Param("ew") Wrapper<ShujukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujukuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShujukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShujukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShujukuEntity> wrapper);
}

