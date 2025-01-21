package com.dao;

import com.entity.BianmujianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BianmujianchaVO;
import com.entity.view.BianmujianchaView;


/**
 * 编目检查
 * 
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public interface BianmujianchaDao extends BaseMapper<BianmujianchaEntity> {
	
	List<BianmujianchaVO> selectListVO(@Param("ew") Wrapper<BianmujianchaEntity> wrapper);
	
	BianmujianchaVO selectVO(@Param("ew") Wrapper<BianmujianchaEntity> wrapper);
	
	List<BianmujianchaView> selectListView(@Param("ew") Wrapper<BianmujianchaEntity> wrapper);

	List<BianmujianchaView> selectListView(Pagination page,@Param("ew") Wrapper<BianmujianchaEntity> wrapper);
	
	BianmujianchaView selectView(@Param("ew") Wrapper<BianmujianchaEntity> wrapper);
	

}
