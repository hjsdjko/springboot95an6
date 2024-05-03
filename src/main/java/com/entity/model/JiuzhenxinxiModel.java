package com.entity.model;

import com.entity.JiuzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 就诊信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
public class JiuzhenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 药物过敏史
	 */
	
	private String yaowuguominshi;
		
	/**
	 * 就诊日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiuzhenriqi;
		
	/**
	 * 现病史
	 */
	
	private String xianbingshi;
		
	/**
	 * 既往病史
	 */
	
	private String jiwangbingshi;
		
	/**
	 * 初步诊断
	 */
	
	private String chubuzhenduan;
		
	/**
	 * 处理意见
	 */
	
	private String chuliyijian;
		
	/**
	 * 门诊记录
	 */
	
	private String menzhenjilu;
				
	
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
	 * 设置：医生账号
	 */
	 
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：药物过敏史
	 */
	 
	public void setYaowuguominshi(String yaowuguominshi) {
		this.yaowuguominshi = yaowuguominshi;
	}
	
	/**
	 * 获取：药物过敏史
	 */
	public String getYaowuguominshi() {
		return yaowuguominshi;
	}
				
	
	/**
	 * 设置：就诊日期
	 */
	 
	public void setJiuzhenriqi(Date jiuzhenriqi) {
		this.jiuzhenriqi = jiuzhenriqi;
	}
	
	/**
	 * 获取：就诊日期
	 */
	public Date getJiuzhenriqi() {
		return jiuzhenriqi;
	}
				
	
	/**
	 * 设置：现病史
	 */
	 
	public void setXianbingshi(String xianbingshi) {
		this.xianbingshi = xianbingshi;
	}
	
	/**
	 * 获取：现病史
	 */
	public String getXianbingshi() {
		return xianbingshi;
	}
				
	
	/**
	 * 设置：既往病史
	 */
	 
	public void setJiwangbingshi(String jiwangbingshi) {
		this.jiwangbingshi = jiwangbingshi;
	}
	
	/**
	 * 获取：既往病史
	 */
	public String getJiwangbingshi() {
		return jiwangbingshi;
	}
				
	
	/**
	 * 设置：初步诊断
	 */
	 
	public void setChubuzhenduan(String chubuzhenduan) {
		this.chubuzhenduan = chubuzhenduan;
	}
	
	/**
	 * 获取：初步诊断
	 */
	public String getChubuzhenduan() {
		return chubuzhenduan;
	}
				
	
	/**
	 * 设置：处理意见
	 */
	 
	public void setChuliyijian(String chuliyijian) {
		this.chuliyijian = chuliyijian;
	}
	
	/**
	 * 获取：处理意见
	 */
	public String getChuliyijian() {
		return chuliyijian;
	}
				
	
	/**
	 * 设置：门诊记录
	 */
	 
	public void setMenzhenjilu(String menzhenjilu) {
		this.menzhenjilu = menzhenjilu;
	}
	
	/**
	 * 获取：门诊记录
	 */
	public String getMenzhenjilu() {
		return menzhenjilu;
	}
			
}
