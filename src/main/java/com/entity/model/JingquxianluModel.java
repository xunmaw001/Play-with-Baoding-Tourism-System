package com.entity.model;

import com.entity.JingquxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 景区线路
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public class JingquxianluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景区地点
	 */
	
	private String jingqudidian;
		
	/**
	 * 景区线路
	 */
	
	private String jingquxianlu;
		
	/**
	 * 景区详情
	 */
	
	private String jingquxiangqing;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
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
	 * 设置：景区地点
	 */
	 
	public void setJingqudidian(String jingqudidian) {
		this.jingqudidian = jingqudidian;
	}
	
	/**
	 * 获取：景区地点
	 */
	public String getJingqudidian() {
		return jingqudidian;
	}
				
	
	/**
	 * 设置：景区线路
	 */
	 
	public void setJingquxianlu(String jingquxianlu) {
		this.jingquxianlu = jingquxianlu;
	}
	
	/**
	 * 获取：景区线路
	 */
	public String getJingquxianlu() {
		return jingquxianlu;
	}
				
	
	/**
	 * 设置：景区详情
	 */
	 
	public void setJingquxiangqing(String jingquxiangqing) {
		this.jingquxiangqing = jingquxiangqing;
	}
	
	/**
	 * 获取：景区详情
	 */
	public String getJingquxiangqing() {
		return jingquxiangqing;
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
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
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
			
}
