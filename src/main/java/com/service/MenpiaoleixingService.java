package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenpiaoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenpiaoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenpiaoleixingView;


/**
 * 门票类型
 *
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface MenpiaoleixingService extends IService<MenpiaoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenpiaoleixingVO> selectListVO(Wrapper<MenpiaoleixingEntity> wrapper);
   	
   	MenpiaoleixingVO selectVO(@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);
   	
   	List<MenpiaoleixingView> selectListView(Wrapper<MenpiaoleixingEntity> wrapper);
   	
   	MenpiaoleixingView selectView(@Param("ew") Wrapper<MenpiaoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenpiaoleixingEntity> wrapper);
   	
}

