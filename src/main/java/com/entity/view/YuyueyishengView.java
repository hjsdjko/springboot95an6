package com.entity.view;

import com.entity.YuyueyishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约医生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
@TableName("yuyueyisheng")
public class YuyueyishengView  extends YuyueyishengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyueyishengView(){
	}
 
 	public YuyueyishengView(YuyueyishengEntity yuyueyishengEntity){
 	try {
			BeanUtils.copyProperties(this, yuyueyishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
