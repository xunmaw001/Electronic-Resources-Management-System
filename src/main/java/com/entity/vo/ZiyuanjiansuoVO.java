package com.entity.vo;

import com.entity.ZiyuanjiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 资源检索
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class ZiyuanjiansuoVO  implements Serializable {
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
