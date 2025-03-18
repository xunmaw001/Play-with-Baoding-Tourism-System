package com.dao;

import com.entity.JiudianmenpiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianmenpiaoVO;
import com.entity.view.JiudianmenpiaoView;


/**
 * 酒店门票
 * 
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface JiudianmenpiaoDao extends BaseMapper<JiudianmenpiaoEntity> {
	
	List<JiudianmenpiaoVO> selectListVO(@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);
	
	JiudianmenpiaoVO selectVO(@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);
	
	List<JiudianmenpiaoView> selectListView(@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);

	List<JiudianmenpiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);
	
	JiudianmenpiaoView selectView(@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);
	
}
