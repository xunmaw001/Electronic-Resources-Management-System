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


import com.dao.ShujukumingchengDao;
import com.entity.ShujukumingchengEntity;
import com.service.ShujukumingchengService;
import com.entity.vo.ShujukumingchengVO;
import com.entity.view.ShujukumingchengView;

@Service("shujukumingchengService")
public class ShujukumingchengServiceImpl extends ServiceImpl<ShujukumingchengDao, ShujukumingchengEntity> implements ShujukumingchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujukumingchengEntity> page = this.selectPage(
                new Query<ShujukumingchengEntity>(params).getPage(),
                new EntityWrapper<ShujukumingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujukumingchengEntity> wrapper) {
		  Page<ShujukumingchengView> page =new Query<ShujukumingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujukumingchengVO> selectListVO(Wrapper<ShujukumingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujukumingchengVO selectVO(Wrapper<ShujukumingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujukumingchengView> selectListView(Wrapper<ShujukumingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujukumingchengView selectView(Wrapper<ShujukumingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
