package com.entity.view;

import com.entity.JiudianmenpiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店门票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
@TableName("jiudianmenpiao")
public class JiudianmenpiaoView  extends JiudianmenpiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudianmenpiaoView(){
	}
 
 	public JiudianmenpiaoView(JiudianmenpiaoEntity jiudianmenpiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiudianmenpiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
