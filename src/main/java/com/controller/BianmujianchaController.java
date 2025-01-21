package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BianmujianchaEntity;
import com.entity.view.BianmujianchaView;

import com.service.BianmujianchaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 编目检查
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@RestController
@RequestMapping("/bianmujiancha")
public class BianmujianchaController {
    @Autowired
    private BianmujianchaService bianmujianchaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BianmujianchaEntity bianmujiancha, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			bianmujiancha.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			bianmujiancha.setYonghuxingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BianmujianchaEntity> ew = new EntityWrapper<BianmujianchaEntity>();
		PageUtils page = bianmujianchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianmujiancha), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BianmujianchaEntity bianmujiancha, 
		HttpServletRequest request){
        EntityWrapper<BianmujianchaEntity> ew = new EntityWrapper<BianmujianchaEntity>();
		PageUtils page = bianmujianchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianmujiancha), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BianmujianchaEntity bianmujiancha){
       	EntityWrapper<BianmujianchaEntity> ew = new EntityWrapper<BianmujianchaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bianmujiancha, "bianmujiancha")); 
        return R.ok().put("data", bianmujianchaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BianmujianchaEntity bianmujiancha){
        EntityWrapper< BianmujianchaEntity> ew = new EntityWrapper< BianmujianchaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bianmujiancha, "bianmujiancha")); 
		BianmujianchaView bianmujianchaView =  bianmujianchaService.selectView(ew);
		return R.ok("查询编目检查成功").put("data", bianmujianchaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BianmujianchaEntity bianmujiancha = bianmujianchaService.selectById(id);
        return R.ok().put("data", bianmujiancha);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BianmujianchaEntity bianmujiancha = bianmujianchaService.selectById(id);
        return R.ok().put("data", bianmujiancha);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BianmujianchaEntity bianmujiancha, HttpServletRequest request){
    	bianmujiancha.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bianmujiancha);

        bianmujianchaService.insert(bianmujiancha);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BianmujianchaEntity bianmujiancha, HttpServletRequest request){
    	bianmujiancha.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bianmujiancha);

        bianmujianchaService.insert(bianmujiancha);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BianmujianchaEntity bianmujiancha, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bianmujiancha);
        bianmujianchaService.updateById(bianmujiancha);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bianmujianchaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BianmujianchaEntity> wrapper = new EntityWrapper<BianmujianchaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuxingming", (String)request.getSession().getAttribute("username"));
		}

		int count = bianmujianchaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
