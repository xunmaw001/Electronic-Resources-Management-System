package com.entity.vo;

import com.entity.ZiyuanliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 资源列表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class ZiyuanliebiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数据库编号
	 */
	
	private String shujukubianhao;
		
	/**
	 * 数据库名称
	 */
	
	private String shujukumingcheng;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 上传时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangchuanshijian;
				
	
	/**
	 * 设置：数据库编号
	 */
	 
	public void setShujukubianhao(String shujukubianhao) {
		this.shujukubianhao = shujukubianhao;
	}
	
	/**
	 * 获取：数据库编号
	 */
	public String getShujukubianhao() {
		return shujukubianhao;
	}
				
	
	/**
	 * 设置：数据库名称
	 */
	 
	public void setShujukumingcheng(String shujukumingcheng) {
		this.shujukumingcheng = shujukumingcheng;
	}
	
	/**
	 * 获取：数据库名称
	 */
	public String getShujukumingcheng() {
		return shujukumingcheng;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：上传时间
	 */
	 
	public void setShangchuanshijian(Date shangchuanshijian) {
		this.shangchuanshijian = shangchuanshijian;
	}
	
	/**
	 * 获取：上传时间
	 */
	public Date getShangchuanshijian() {
		return shangchuanshijian;
	}
			
}
