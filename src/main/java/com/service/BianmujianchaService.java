package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BianmujianchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BianmujianchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BianmujianchaView;


/**
 * 编目检查
 *
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface BianmujianchaService extends IService<BianmujianchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BianmujianchaVO> selectListVO(Wrapper<BianmujianchaEntity> wrapper);
   	
   	BianmujianchaVO selectVO(@Param("ew") Wrapper<BianmujianchaEntity> wrapper);
   	
   	List<BianmujianchaView> selectListView(Wrapper<BianmujianchaEntity> wrapper);
   	
   	BianmujianchaView selectView(@Param("ew") Wrapper<BianmujianchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BianmujianchaEntity> wrapper);
   	

}

