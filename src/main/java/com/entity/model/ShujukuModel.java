package com.entity.model;

import com.entity.ShujukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 数据库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class ShujukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数据库名称
	 */
	
	private String shujukumingcheng;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 创建时间
	 */
	
	private String chuangjianshijian;
		
	/**
	 * 分类方法
	 */
	
	private String fenleifangfa;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 描述
	 */
	
	private String miaoshu;
				
	
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
	 * 设置：创建时间
	 */
	 
	public void setChuangjianshijian(String chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	
	/**
	 * 获取：创建时间
	 */
	public String getChuangjianshijian() {
		return chuangjianshijian;
	}
				
	
	/**
	 * 设置：分类方法
	 */
	 
	public void setFenleifangfa(String fenleifangfa) {
		this.fenleifangfa = fenleifangfa;
	}
	
	/**
	 * 获取：分类方法
	 */
	public String getFenleifangfa() {
		return fenleifangfa;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：描述
	 */
	 
	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}
	
	/**
	 * 获取：描述
	 */
	public String getMiaoshu() {
		return miaoshu;
	}
			
}
