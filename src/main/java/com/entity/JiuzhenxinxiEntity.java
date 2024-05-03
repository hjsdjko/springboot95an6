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
 * 就诊信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
@TableName("jiuzhenxinxi")
public class JiuzhenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuzhenxinxiEntity() {
		
	}
	
	public JiuzhenxinxiEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
