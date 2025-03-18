package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfeijihuocheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfeijihuocheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfeijihuocheView;


/**
 * 飞机火车评论表
 *
 * @author 
 * @email 
 * @date 2021-03-24 20:47:42
 */
public interface DiscussfeijihuocheService extends IService<DiscussfeijihuocheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfeijihuocheVO> selectListVO(Wrapper<DiscussfeijihuocheEntity> wrapper);
   	
   	DiscussfeijihuocheVO selectVO(@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);
   	
   	List<DiscussfeijihuocheView> selectListView(Wrapper<DiscussfeijihuocheEntity> wrapper);
   	
   	DiscussfeijihuocheView selectView(@Param("ew") Wrapper<DiscussfeijihuocheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfeijihuocheEntity> wrapper);
   	
}

