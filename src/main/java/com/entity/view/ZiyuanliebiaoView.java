package com.entity.view;

import com.entity.ZiyuanliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资源列表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@TableName("ziyuanliebiao")
public class ZiyuanliebiaoView  extends ZiyuanliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiyuanliebiaoView(){
	}
 
 	public ZiyuanliebiaoView(ZiyuanliebiaoEntity ziyuanliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, ziyuanliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
