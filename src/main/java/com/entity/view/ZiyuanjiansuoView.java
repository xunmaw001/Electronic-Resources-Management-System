package com.entity.view;

import com.entity.ZiyuanjiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资源检索
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@TableName("ziyuanjiansuo")
public class ZiyuanjiansuoView  extends ZiyuanjiansuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZiyuanjiansuoView(){
	}
 
 	public ZiyuanjiansuoView(ZiyuanjiansuoEntity ziyuanjiansuoEntity){
 	try {
			BeanUtils.copyProperties(this, ziyuanjiansuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
