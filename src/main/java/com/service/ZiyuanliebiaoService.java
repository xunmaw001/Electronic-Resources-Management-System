package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZiyuanliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZiyuanliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZiyuanliebiaoView;


/**
 * 资源列表
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanliebiaoService extends IService<ZiyuanliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZiyuanliebiaoVO> selectListVO(Wrapper<ZiyuanliebiaoEntity> wrapper);
   	
   	ZiyuanliebiaoVO selectVO(@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);
   	
   	List<ZiyuanliebiaoView> selectListView(Wrapper<ZiyuanliebiaoEntity> wrapper);
   	
   	ZiyuanliebiaoView selectView(@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZiyuanliebiaoEntity> wrapper);
   	

}

