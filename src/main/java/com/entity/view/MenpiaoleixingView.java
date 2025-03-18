package com.entity.view;

import com.entity.MenpiaoleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门票类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
@TableName("menpiaoleixing")
public class MenpiaoleixingView  extends MenpiaoleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenpiaoleixingView(){
	}
 
 	public MenpiaoleixingView(MenpiaoleixingEntity menpiaoleixingEntity){
 	try {
			BeanUtils.copyProperties(this, menpiaoleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
