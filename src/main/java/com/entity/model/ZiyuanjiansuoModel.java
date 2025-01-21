package com.entity.model;

import com.entity.ZiyuanjiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 资源检索
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class ZiyuanjiansuoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 多库检索
	 */
	
	private String duokujiansuo;
				
	
	/**
	 * 设置：多库检索
	 */
	 
	public void setDuokujiansuo(String duokujiansuo) {
		this.duokujiansuo = duokujiansuo;
	}
	
	/**
	 * 获取：多库检索
	 */
	public String getDuokujiansuo() {
		return duokujiansuo;
	}
			
}
