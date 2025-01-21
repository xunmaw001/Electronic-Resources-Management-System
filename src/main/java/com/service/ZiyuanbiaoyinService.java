package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanbiaoyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanbiaoyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanbiaoyinView;


/**
 * 资源标引
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanbiaoyinService extends IService<ZiyuanbiaoyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanbiaoyinVO> selectListVO(Wrapper<ZiyuanbiaoyinEntity> wrapper);
   	
   	ZiyuanbiaoyinVO selectVO(@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);
   	
   	List<ZiyuanbiaoyinView> selectListView(Wrapper<ZiyuanbiaoyinEntity> wrapper);
   	
   	ZiyuanbiaoyinView selectView(@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanbiaoyinEntity> wrapper);
   	

}

