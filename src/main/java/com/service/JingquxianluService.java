package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingquxianluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingquxianluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingquxianluView;


/**
 * 景区线路
 *
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface JingquxianluService extends IService<JingquxianluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingquxianluVO> selectListVO(Wrapper<JingquxianluEntity> wrapper);
   	
   	JingquxianluVO selectVO(@Param("ew") Wrapper<JingquxianluEntity> wrapper);
   	
   	List<JingquxianluView> selectListView(Wrapper<JingquxianluEntity> wrapper);
   	
   	JingquxianluView selectView(@Param("ew") Wrapper<JingquxianluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingquxianluEntity> wrapper);
   	
}

