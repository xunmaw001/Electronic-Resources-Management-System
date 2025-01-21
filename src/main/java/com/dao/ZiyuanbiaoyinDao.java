package com.dao;

import com.entity.ZiyuanbiaoyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanbiaoyinVO;
import com.entity.view.ZiyuanbiaoyinView;


/**
 * 资源标引
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanbiaoyinDao extends BaseMapper<ZiyuanbiaoyinEntity> {
	
	List<ZiyuanbiaoyinVO> selectListVO(@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);
	
	ZiyuanbiaoyinVO selectVO(@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);
	
	List<ZiyuanbiaoyinView> selectListView(@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);

	List<ZiyuanbiaoyinView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);
	
	ZiyuanbiaoyinView selectView(@Param("ew") Wrapper<ZiyuanbiaoyinEntity> wrapper);
	

}
