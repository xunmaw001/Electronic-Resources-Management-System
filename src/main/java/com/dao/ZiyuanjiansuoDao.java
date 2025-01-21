package com.dao;

import com.entity.ZiyuanjiansuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanjiansuoVO;
import com.entity.view.ZiyuanjiansuoView;


/**
 * 资源检索
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanjiansuoDao extends BaseMapper<ZiyuanjiansuoEntity> {
	
	List<ZiyuanjiansuoVO> selectListVO(@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);
	
	ZiyuanjiansuoVO selectVO(@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);
	
	List<ZiyuanjiansuoView> selectListView(@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);

	List<ZiyuanjiansuoView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);
	
	ZiyuanjiansuoView selectView(@Param("ew") Wrapper<ZiyuanjiansuoEntity> wrapper);
	

}
