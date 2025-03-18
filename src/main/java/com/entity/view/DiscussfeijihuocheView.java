package com.entity.view;

import com.entity.DiscussfeijihuocheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 飞机火车评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 20:47:42
 */
@TableName("discussfeijihuoche")
public class DiscussfeijihuocheView  extends DiscussfeijihuocheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfeijihuocheView(){
	}
 
 	public DiscussfeijihuocheView(DiscussfeijihuocheEntity discussfeijihuocheEntity){
 	try {
			BeanUtils.copyProperties(this, discussfeijihuocheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
