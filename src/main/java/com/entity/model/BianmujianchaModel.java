package com.entity.model;

import com.entity.BianmujianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 编目检查
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class BianmujianchaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数据库编码
	 */
	
	private String shujukubianma;
		
	/**
	 * 数据库名称
	 */
	
	private String shujukumingcheng;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 提交审批时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshenpishijian;
				
	
	/**
	 * 设置：数据库编码
	 */
	 
	public void setShujukubianma(String shujukubianma) {
		this.shujukubianma = shujukubianma;
	}
	
	/**
	 * 获取：数据库编码
	 */
	public String getShujukubianma() {
		return shujukubianma;
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
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：提交审批时间
	 */
	 
	public void setTijiaoshenpishijian(Date tijiaoshenpishijian) {
		this.tijiaoshenpishijian = tijiaoshenpishijian;
	}
	
	/**
	 * 获取：提交审批时间
	 */
	public Date getTijiaoshenpishijian() {
		return tijiaoshenpishijian;
	}
			
}
