package com.dao;

import com.entity.DiscussjingquxianluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingquxianluVO;
import com.entity.view.DiscussjingquxianluView;


/**
 * 景区线路评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-24 20:47:42
 */
public interface DiscussjingquxianluDao extends BaseMapper<DiscussjingquxianluEntity> {
	
	List<DiscussjingquxianluVO> selectListVO(@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);
	
	DiscussjingquxianluVO selectVO(@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);
	
	List<DiscussjingquxianluView> selectListView(@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);

	List<DiscussjingquxianluView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);
	
	DiscussjingquxianluView selectView(@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);
	
}
