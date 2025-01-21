package com.dao;

import com.entity.XitongrizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitongrizhiVO;
import com.entity.view.XitongrizhiView;


/**
 * 系统日志
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface XitongrizhiDao extends BaseMapper<XitongrizhiEntity> {
	
	List<XitongrizhiVO> selectListVO(@Param("ew") Wrapper<XitongrizhiEntity> wrapper);
	
	XitongrizhiVO selectVO(@Param("ew") Wrapper<XitongrizhiEntity> wrapper);
	
	List<XitongrizhiView> selectListView(@Param("ew") Wrapper<XitongrizhiEntity> wrapper);

	List<XitongrizhiView> selectListView(Pagination page,@Param("ew") Wrapper<XitongrizhiEntity> wrapper);
	
	XitongrizhiView selectView(@Param("ew") Wrapper<XitongrizhiEntity> wrapper);
	

}
