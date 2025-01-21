package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanjiansuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanjiansuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanjiansuoView;


/**
 * 资源检索
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanjiansuoService extends IService<ZiyuanjiansuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanjiansuoVO> selectListVO(Wrapper<ZiyuanjiansuoEntity> wrapper);
   	
   	ZiyuanjiansuoVO selectVO(@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);
   	
   	List<ZiyuanjiansuoView> selectListView(Wrapper<ZiyuanjiansuoEntity> wrapper);
   	
   	ZiyuanjiansuoView selectView(@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanjiansuoEntity> wrapper);
   	

}

