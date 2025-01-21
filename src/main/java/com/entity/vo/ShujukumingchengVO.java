package com.entity.vo;

import com.entity.ShujukumingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 数据库名称
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-19 14:41:53
 */
public class ShujukumingchengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
