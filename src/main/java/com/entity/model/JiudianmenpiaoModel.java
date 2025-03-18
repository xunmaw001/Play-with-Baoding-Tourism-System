package com.entity.model;

import com.entity.JiudianmenpiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 酒店门票
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public class JiudianmenpiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 酒店地点
	 */
	
	private String jiudiandidian;
		
	/**
	 * 门票数量
	 */
	
	private Integer menpiaoshuliang;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 门票类型
	 */
	
	private String menpiaoleixing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：酒店地点
	 */
	 
	public void setJiudiandidian(String jiudiandidian) {
		this.jiudiandidian = jiudiandidian;
	}
	
	/**
	 * 获取：酒店地点
	 */
	public String getJiudiandidian() {
		return jiudiandidian;
	}
				
	
	/**
	 * 设置：门票数量
	 */
	 
	public void setMenpiaoshuliang(Integer menpiaoshuliang) {
		this.menpiaoshuliang = menpiaoshuliang;
	}
	
	/**
	 * 获取：门票数量
	 */
	public Integer getMenpiaoshuliang() {
		return menpiaoshuliang;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：门票类型
	 */
	 
	public void setMenpiaoleixing(String menpiaoleixing) {
		this.menpiaoleixing = menpiaoleixing;
	}
	
	/**
	 * 获取：门票类型
	 */
	public String getMenpiaoleixing() {
		return menpiaoleixing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
