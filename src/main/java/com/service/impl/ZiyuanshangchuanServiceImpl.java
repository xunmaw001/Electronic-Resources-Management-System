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


import com.dao.ZiyuanshangchuanDao;
import com.entity.ZiyuanshangchuanEntity;
import com.service.ZiyuanshangchuanService;
import com.entity.vo.ZiyuanshangchuanVO;
import com.entity.view.ZiyuanshangchuanView;

@Service("ziyuanshangchuanService")
public class ZiyuanshangchuanServiceImpl extends ServiceImpl<ZiyuanshangchuanDao, ZiyuanshangchuanEntity> implements ZiyuanshangchuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanshangchuanEntity> page = this.selectPage(
                new Query<ZiyuanshangchuanEntity>(params).getPage(),
                new EntityWrapper<ZiyuanshangchuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanshangchuanEntity> wrapper) {
		  Page<ZiyuanshangchuanView> page =new Query<ZiyuanshangchuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanshangchuanVO> selectListVO(Wrapper<ZiyuanshangchuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanshangchuanVO selectVO(Wrapper<ZiyuanshangchuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanshangchuanView> selectListView(Wrapper<ZiyuanshangchuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanshangchuanView selectView(Wrapper<ZiyuanshangchuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZiyuanshangchuanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZiyuanshangchuanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZiyuanshangchuanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
