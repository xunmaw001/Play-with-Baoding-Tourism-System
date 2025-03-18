package com.dao;

import com.entity.DiscussfeijihuocheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfeijihuocheVO;
import com.entity.view.DiscussfeijihuocheView;


/**
 * 飞机火车评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-24 20:47:42
 */
public interface DiscussfeijihuocheDao extends BaseMapper<DiscussfeijihuocheEntity> {
	
	List<DiscussfeijihuocheVO> selectListVO(@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);
	
	DiscussfeijihuocheVO selectVO(@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);
	
	List<DiscussfeijihuocheView> selectListView(@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);

	List<DiscussfeijihuocheView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);
	
	DiscussfeijihuocheView selectView(@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);
	
}
