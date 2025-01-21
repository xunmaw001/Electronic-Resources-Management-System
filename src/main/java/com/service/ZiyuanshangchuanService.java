package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanshangchuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanshangchuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanshangchuanView;


/**
 * 资源上传
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanshangchuanService extends IService<ZiyuanshangchuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanshangchuanVO> selectListVO(Wrapper<ZiyuanshangchuanEntity> wrapper);
   	
   	ZiyuanshangchuanVO selectVO(@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
   	
   	List<ZiyuanshangchuanView> selectListView(Wrapper<ZiyuanshangchuanEntity> wrapper);
   	
   	ZiyuanshangchuanView selectView(@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanshangchuanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZiyuanshangchuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZiyuanshangchuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZiyuanshangchuanEntity> wrapper);
}

