package com.entity.view;

import com.entity.FeijihuocheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 飞机火车
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
@TableName("feijihuoche")
public class FeijihuocheView  extends FeijihuocheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeijihuocheView(){
	}
 
 	public FeijihuocheView(FeijihuocheEntity feijihuocheEntity){
 	try {
			BeanUtils.copyProperties(this, feijihuocheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
