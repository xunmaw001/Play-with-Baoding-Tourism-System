package com.dao;

import com.entity.JingquxianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingquxianluVO;
import com.entity.view.JingquxianluView;


/**
 * 景区线路
 * 
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface JingquxianluDao extends BaseMapper<JingquxianluEntity> {
	
	List<JingquxianluVO> selectListVO(@Param("ew") Wrapper<JingquxianluEntity> wrapper);
	
	JingquxianluVO selectVO(@Param("ew") Wrapper<JingquxianluEntity> wrapper);
	
	List<JingquxianluView> selectListView(@Param("ew") Wrapper<JingquxianluEntity> wrapper);

	List<JingquxianluView> selectListView(Pagination page,@Param("ew") Wrapper<JingquxianluEntity> wrapper);
	
	JingquxianluView selectView(@Param("ew") Wrapper<JingquxianluEntity> wrapper);
	
}
