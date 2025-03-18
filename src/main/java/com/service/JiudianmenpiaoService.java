package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianmenpiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianmenpiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianmenpiaoView;


/**
 * 酒店门票
 *
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface JiudianmenpiaoService extends IService<JiudianmenpiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianmenpiaoVO> selectListVO(Wrapper<JiudianmenpiaoEntity> wrapper);
   	
   	JiudianmenpiaoVO selectVO(@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);
   	
   	List<JiudianmenpiaoView> selectListView(Wrapper<JiudianmenpiaoEntity> wrapper);
   	
   	JiudianmenpiaoView selectView(@Param("ew") Wrapper<JiudianmenpiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianmenpiaoEntity> wrapper);
   	
}

