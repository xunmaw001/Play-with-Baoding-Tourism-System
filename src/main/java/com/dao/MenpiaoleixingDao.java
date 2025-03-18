package com.dao;

import com.entity.MenpiaoleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenpiaoleixingVO;
import com.entity.view.MenpiaoleixingView;


/**
 * 门票类型
 * 
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface MenpiaoleixingDao extends BaseMapper<MenpiaoleixingEntity> {
	
	List<MenpiaoleixingVO> selectListVO(@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);
	
	MenpiaoleixingVO selectVO(@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);
	
	List<MenpiaoleixingView> selectListView(@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);

	List<MenpiaoleixingView> selectListView(Pagination page,@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);
	
	MenpiaoleixingView selectView(@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);
	
}
