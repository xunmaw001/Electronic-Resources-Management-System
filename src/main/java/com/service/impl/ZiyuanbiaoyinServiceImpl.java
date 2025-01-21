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


import com.dao.ZiyuanbiaoyinDao;
import com.entity.ZiyuanbiaoyinEntity;
import com.service.ZiyuanbiaoyinService;
import com.entity.vo.ZiyuanbiaoyinVO;
import com.entity.view.ZiyuanbiaoyinView;

@Service("ziyuanbiaoyinService")
public class ZiyuanbiaoyinServiceImpl extends ServiceImpl<ZiyuanbiaoyinDao, ZiyuanbiaoyinEntity> implements ZiyuanbiaoyinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanbiaoyinEntity> page = this.selectPage(
                new Query<ZiyuanbiaoyinEntity>(params).getPage(),
                new EntityWrapper<ZiyuanbiaoyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanbiaoyinEntity> wrapper) {
		  Page<ZiyuanbiaoyinView> page =new Query<ZiyuanbiaoyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanbiaoyinVO> selectListVO(Wrapper<ZiyuanbiaoyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanbiaoyinVO selectVO(Wrapper<ZiyuanbiaoyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanbiaoyinView> selectListView(Wrapper<ZiyuanbiaoyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanbiaoyinView selectView(Wrapper<ZiyuanbiaoyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
