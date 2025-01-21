package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujukumingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujukumingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujukumingchengView;


/**
 * 数据库名称
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ShujukumingchengService extends IService<ShujukumingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujukumingchengVO> selectListVO(Wrapper<ShujukumingchengEntity> wrapper);
   	
   	ShujukumingchengVO selectVO(@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);
   	
   	List<ShujukumingchengView> selectListView(Wrapper<ShujukumingchengEntity> wrapper);
   	
   	ShujukumingchengView selectView(@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujukumingchengEntity> wrapper);
   	

}

