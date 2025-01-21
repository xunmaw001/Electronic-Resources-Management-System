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
 * 数据库名称
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@TableName("shujukumingcheng")
public class ShujukumingchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujukumingchengEntity() {
		
	}
	
	public ShujukumingchengEntity(T t) {
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
	 * 电子图书
	 */
					
	private String dianzitushu;
	
	/**
	 * 期刊
	 */
					
	private String qikan;
	
	/**
	 * 文献
	 */
					
	private String wenxian;
	
	/**
	 * 论文
	 */
					
	private String lunwen;
	
	/**
	 * 标准
	 */
					
	private String biaozhun;
	
	/**
	 * 专刊
	 */
					
	private String zhuankan;
	
	/**
	 * 模板
	 */
					
	private String moban;
	
	/**
	 * 工具
	 */
					
	private String gongju;
	
	/**
	 * 会议
	 */
					
	private String huiyi;
	
	
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
	 * 设置：电子图书
	 */
	public void setDianzitushu(String dianzitushu) {
		this.dianzitushu = dianzitushu;
	}
	/**
	 * 获取：电子图书
	 */
	public String getDianzitushu() {
		return dianzitushu;
	}
	/**
	 * 设置：期刊
	 */
	public void setQikan(String qikan) {
		this.qikan = qikan;
	}
	/**
	 * 获取：期刊
	 */
	public String getQikan() {
		return qikan;
	}
	/**
	 * 设置：文献
	 */
	public void setWenxian(String wenxian) {
		this.wenxian = wenxian;
	}
	/**
	 * 获取：文献
	 */
	public String getWenxian() {
		return wenxian;
	}
	/**
	 * 设置：论文
	 */
	public void setLunwen(String lunwen) {
		this.lunwen = lunwen;
	}
	/**
	 * 获取：论文
	 */
	public String getLunwen() {
		return lunwen;
	}
	/**
	 * 设置：标准
	 */
	public void setBiaozhun(String biaozhun) {
		this.biaozhun = biaozhun;
	}
	/**
	 * 获取：标准
	 */
	public String getBiaozhun() {
		return biaozhun;
	}
	/**
	 * 设置：专刊
	 */
	public void setZhuankan(String zhuankan) {
		this.zhuankan = zhuankan;
	}
	/**
	 * 获取：专刊
	 */
	public String getZhuankan() {
		return zhuankan;
	}
	/**
	 * 设置：模板
	 */
	public void setMoban(String moban) {
		this.moban = moban;
	}
	/**
	 * 获取：模板
	 */
	public String getMoban() {
		return moban;
	}
	/**
	 * 设置：工具
	 */
	public void setGongju(String gongju) {
		this.gongju = gongju;
	}
	/**
	 * 获取：工具
	 */
	public String getGongju() {
		return gongju;
	}
	/**
	 * 设置：会议
	 */
	public void setHuiyi(String huiyi) {
		this.huiyi = huiyi;
	}
	/**
	 * 获取：会议
	 */
	public String getHuiyi() {
		return huiyi;
	}

}
