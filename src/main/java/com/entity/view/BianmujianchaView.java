package com.entity.view;

import com.entity.BianmujianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 编目检查
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@TableName("bianmujiancha")
public class BianmujianchaView  extends BianmujianchaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BianmujianchaView(){
	}
 
 	public BianmujianchaView(BianmujianchaEntity bianmujianchaEntity){
 	try {
			BeanUtils.copyProperties(this, bianmujianchaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
