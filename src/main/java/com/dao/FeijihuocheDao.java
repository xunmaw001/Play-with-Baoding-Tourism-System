package com.dao;

import com.entity.FeijihuocheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeijihuocheVO;
import com.entity.view.FeijihuocheView;


/**
 * 飞机火车
 * 
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface FeijihuocheDao extends BaseMapper<FeijihuocheEntity> {
	
	List<FeijihuocheVO> selectListVO(@Param("ew") Wrapper<FeijihuocheEntity> wrapper);
	
	FeijihuocheVO selectVO(@Param("ew") Wrapper<FeijihuocheEntity> wrapper);
	
	List<FeijihuocheView> selectListView(@Param("ew") Wrapper<FeijihuocheEntity> wrapper);

	List<FeijihuocheView> selectListView(Pagination page,@Param("ew") Wrapper<FeijihuocheEntity> wrapper);
	
	FeijihuocheView selectView(@Param("ew") Wrapper<FeijihuocheEntity> wrapper);
	
}
