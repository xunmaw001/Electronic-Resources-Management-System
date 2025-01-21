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


import com.dao.ZiyuanjiansuoDao;
import com.entity.ZiyuanjiansuoEntity;
import com.service.ZiyuanjiansuoService;
import com.entity.vo.ZiyuanjiansuoVO;
import com.entity.view.ZiyuanjiansuoView;

@Service("ziyuanjiansuoService")
public class ZiyuanjiansuoServiceImpl extends ServiceImpl<ZiyuanjiansuoDao, ZiyuanjiansuoEntity> implements ZiyuanjiansuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZiyuanjiansuoEntity> page = this.selectPage(
                new Query<ZiyuanjiansuoEntity>(params).getPage(),
                new EntityWrapper<ZiyuanjiansuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZiyuanjiansuoEntity> wrapper) {
		  Page<ZiyuanjiansuoView> page =new Query<ZiyuanjiansuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZiyuanjiansuoVO> selectListVO(Wrapper<ZiyuanjiansuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZiyuanjiansuoVO selectVO(Wrapper<ZiyuanjiansuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZiyuanjiansuoView> selectListView(Wrapper<ZiyuanjiansuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZiyuanjiansuoView selectView(Wrapper<ZiyuanjiansuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
