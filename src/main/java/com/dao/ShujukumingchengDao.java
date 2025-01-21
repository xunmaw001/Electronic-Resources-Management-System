package com.dao;

import com.entity.ShujukumingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujukumingchengVO;
import com.entity.view.ShujukumingchengView;


/**
 * 数据库名称
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface ShujukumingchengDao extends BaseMapper<ShujukumingchengEntity> {
	
	List<ShujukumingchengVO> selectListVO(@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);
	
	ShujukumingchengVO selectVO(@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);
	
	List<ShujukumingchengView> selectListView(@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);

	List<ShujukumingchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);
	
	ShujukumingchengView selectView(@Param("ew") Wrapper<ShujukumingchengEntity> wrapper);
	

}
