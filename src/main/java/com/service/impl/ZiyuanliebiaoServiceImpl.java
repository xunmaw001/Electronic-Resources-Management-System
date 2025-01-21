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


import com.dao.ZiyuanliebiaoDao;
import com.entity.ZiyuanliebiaoEntity;
import com.service.ZiyuanliebiaoService;
import com.entity.vo.ZiyuanliebiaoVO;
import com.entity.view.ZiyuanliebiaoView;

@Service("ziyuanliebiaoService")
public class ZiyuanliebiaoServiceImpl extends ServiceImpl<ZiyuanliebiaoDao, ZiyuanliebiaoEntity> implements ZiyuanliebiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanliebiaoEntity> page = this.selectPage(
                new Query<ZiyuanliebiaoEntity>(params).getPage(),
                new EntityWrapper<ZiyuanliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanliebiaoEntity> wrapper) {
		  Page<ZiyuanliebiaoView> page =new Query<ZiyuanliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanliebiaoVO> selectListVO(Wrapper<ZiyuanliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanliebiaoVO selectVO(Wrapper<ZiyuanliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanliebiaoView> selectListView(Wrapper<ZiyuanliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanliebiaoView selectView(Wrapper<ZiyuanliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
