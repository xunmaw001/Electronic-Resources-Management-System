package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 数据库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@TableName("shujuku")
public class ShujukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujukuEntity() {
		
	}
	
	public ShujukuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 数据库编码
	 */
					
	private String shujukubianma;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
