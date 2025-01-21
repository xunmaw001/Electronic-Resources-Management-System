package com.dao;

import com.entity.ZiyuanliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanliebiaoVO;
import com.entity.view.ZiyuanliebiaoView;


/**
 * 资源列表
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanliebiaoDao extends BaseMapper<ZiyuanliebiaoEntity> {
	
	List<ZiyuanliebiaoVO> selectListVO(@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);
	
	ZiyuanliebiaoVO selectVO(@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);
	
	List<ZiyuanliebiaoView> selectListView(@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);

	List<ZiyuanliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);
	
	ZiyuanliebiaoView selectView(@Param("ew") Wrapper<ZiyuanliebiaoEntity> wrapper);
	

}
