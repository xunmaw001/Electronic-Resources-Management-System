package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BianmujianchaDao;
import com.entity.BianmujianchaEntity;
import com.service.BianmujianchaService;
import com.entity.vo.BianmujianchaVO;
import com.entity.view.BianmujianchaView;

@Service("bianmujianchaService")
public class BianmujianchaServiceImpl extends ServiceImpl<BianmujianchaDao, BianmujianchaEntity> implements BianmujianchaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BianmujianchaEntity> page = this.selectPage(
                new Query<BianmujianchaEntity>(params).getPage(),
                new EntityWrapper<BianmujianchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BianmujianchaEntity> wrapper) {
		  Page<BianmujianchaView> page =new Query<BianmujianchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BianmujianchaVO> selectListVO(Wrapper<BianmujianchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BianmujianchaVO selectVO(Wrapper<BianmujianchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BianmujianchaView> selectListView(Wrapper<BianmujianchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BianmujianchaView selectView(Wrapper<BianmujianchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
