package com.entity.vo;

import com.entity.JiankangdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康档案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
public class JiankangdanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 用户电话
	 */
	
	private String yonghudianhua;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 药物过敏
	 */
	
	private String yaowuguomin;
		
	/**
	 * 重大病史
	 */
	
	private String zhongdabingshi;
		
	/**
	 * 家族病史
	 */
	
	private String jiazubingshi;
		
	/**
	 * 住院记录
	 */
	
	private String zhuyuanjilu;
		
	/**
	 * 档案信息
	 */
	
	private String danganxinxi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：用户电话
	 */
	 
	public void setYonghudianhua(String yonghudianhua) {
		this.yonghudianhua = yonghudianhua;
	}
	
	/**
	 * 获取：用户电话
	 */
	public String getYonghudianhua() {
		return yonghudianhua;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：药物过敏
	 */
	 
	public void setYaowuguomin(String yaowuguomin) {
		this.yaowuguomin = yaowuguomin;
	}
	
	/**
	 * 获取：药物过敏
	 */
	public String getYaowuguomin() {
		return yaowuguomin;
	}
				
	
	/**
	 * 设置：重大病史
	 */
	 
	public void setZhongdabingshi(String zhongdabingshi) {
		this.zhongdabingshi = zhongdabingshi;
	}
	
	/**
	 * 获取：重大病史
	 */
	public String getZhongdabingshi() {
		return zhongdabingshi;
	}
				
	
	/**
	 * 设置：家族病史
	 */
	 
	public void setJiazubingshi(String jiazubingshi) {
		this.jiazubingshi = jiazubingshi;
	}
	
	/**
	 * 获取：家族病史
	 */
	public String getJiazubingshi() {
		return jiazubingshi;
	}
				
	
	/**
	 * 设置：住院记录
	 */
	 
	public void setZhuyuanjilu(String zhuyuanjilu) {
		this.zhuyuanjilu = zhuyuanjilu;
	}
	
	/**
	 * 获取：住院记录
	 */
	public String getZhuyuanjilu() {
		return zhuyuanjilu;
	}
				
	
	/**
	 * 设置：档案信息
	 */
	 
	public void setDanganxinxi(String danganxinxi) {
		this.danganxinxi = danganxinxi;
	}
	
	/**
	 * 获取：档案信息
	 */
	public String getDanganxinxi() {
		return danganxinxi;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
