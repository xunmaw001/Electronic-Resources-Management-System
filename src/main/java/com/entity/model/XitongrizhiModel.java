package com.entity.model;

import com.entity.XitongrizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 系统日志
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class XitongrizhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 数据库名称
	 */
	
	private String shujukumingcheng;
		
	/**
	 * 分类方法
	 */
	
	private String fenleifangfa;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
				
	
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
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
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
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
			
}
