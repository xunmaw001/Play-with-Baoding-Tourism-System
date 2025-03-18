package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingquxianluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingquxianluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingquxianluView;


/**
 * 景区线路评论表
 *
 * @author 
 * @email 
 * @date 2021-03-24 20:47:42
 */
public interface DiscussjingquxianluService extends IService<DiscussjingquxianluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingquxianluVO> selectListVO(Wrapper<DiscussjingquxianluEntity> wrapper);
   	
   	DiscussjingquxianluVO selectVO(@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);
   	
   	List<DiscussjingquxianluView> selectListView(Wrapper<DiscussjingquxianluEntity> wrapper);
   	
   	DiscussjingquxianluView selectView(@Param("ew") Wrapper<DiscussjingquxianluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingquxianluEntity> wrapper);
   	
}

