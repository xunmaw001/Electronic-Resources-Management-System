package com.dao;

import com.entity.ZiyuanshangchuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZiyuanshangchuanVO;
import com.entity.view.ZiyuanshangchuanView;


/**
 * 资源上传
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ZiyuanshangchuanDao extends BaseMapper<ZiyuanshangchuanEntity> {
	
	List<ZiyuanshangchuanVO> selectListVO(@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
	
	ZiyuanshangchuanVO selectVO(@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
	
	List<ZiyuanshangchuanView> selectListView(@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);

	List<ZiyuanshangchuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
	
	ZiyuanshangchuanView selectView(@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZiyuanshangchuanEntity> wrapper);
}
