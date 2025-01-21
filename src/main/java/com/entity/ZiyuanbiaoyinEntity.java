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
 * 资源标引
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
@TableName("ziyuanbiaoyin")
public class ZiyuanbiaoyinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZiyuanbiaoyinEntity() {
		
	}
	
	public ZiyuanbiaoyinEntity(T t) {
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
	 * 书号
	 */
					
	private String shuhao;
	
	/**
	 * 书名
	 */
					
	private String shuming;
	
	/**
	 * 作者
	 */
					
	private String zuozhe;
	
	/**
	 * 其他责任者
	 */
					
	private String qitazerenzhe;
	
	/**
	 * 出版社
	 */
					
	private String chubanshe;
	
	/**
	 * 版次
	 */
					
	private String banci;
	
	/**
	 * 出版时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chubanshijian;
	
	/**
	 * 页数
	 */
					
	private String yeshu;
	
	/**
	 * 语言
	 */
					
	private String yuyan;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 关键字
	 */
					
	private String guanjianzi;
	
	/**
	 * 摘要
	 */
					
	private String zhaiyao;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：书号
	 */
	public void setShuhao(String shuhao) {
		this.shuhao = shuhao;
	}
	/**
	 * 获取：书号
	 */
	public String getShuhao() {
		return shuhao;
	}
	/**
	 * 设置：书名
	 */
	public void setShuming(String shuming) {
		this.shuming = shuming;
	}
	/**
	 * 获取：书名
	 */
	public String getShuming() {
		return shuming;
	}
	/**
	 * 设置：作者
	 */
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
	/**
	 * 设置：其他责任者
	 */
	public void setQitazerenzhe(String qitazerenzhe) {
		this.qitazerenzhe = qitazerenzhe;
	}
	/**
	 * 获取：其他责任者
	 */
	public String getQitazerenzhe() {
		return qitazerenzhe;
	}
	/**
	 * 设置：出版社
	 */
	public void setChubanshe(String chubanshe) {
		this.chubanshe = chubanshe;
	}
	/**
	 * 获取：出版社
	 */
	public String getChubanshe() {
		return chubanshe;
	}
	/**
	 * 设置：版次
	 */
	public void setBanci(String banci) {
		this.banci = banci;
	}
	/**
	 * 获取：版次
	 */
	public String getBanci() {
		return banci;
	}
	/**
	 * 设置：出版时间
	 */
	public void setChubanshijian(Date chubanshijian) {
		this.chubanshijian = chubanshijian;
	}
	/**
	 * 获取：出版时间
	 */
	public Date getChubanshijian() {
		return chubanshijian;
	}
	/**
	 * 设置：页数
	 */
	public void setYeshu(String yeshu) {
		this.yeshu = yeshu;
	}
	/**
	 * 获取：页数
	 */
	public String getYeshu() {
		return yeshu;
	}
	/**
	 * 设置：语言
	 */
	public void setYuyan(String yuyan) {
		this.yuyan = yuyan;
	}
	/**
	 * 获取：语言
	 */
	public String getYuyan() {
		return yuyan;
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
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：关键字
	 */
	public void setGuanjianzi(String guanjianzi) {
		this.guanjianzi = guanjianzi;
	}
	/**
	 * 获取：关键字
	 */
	public String getGuanjianzi() {
		return guanjianzi;
	}
	/**
	 * 设置：摘要
	 */
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	/**
	 * 获取：摘要
	 */
	public String getZhaiyao() {
		return zhaiyao;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
