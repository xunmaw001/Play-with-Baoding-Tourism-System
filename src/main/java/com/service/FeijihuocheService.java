package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeijihuocheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeijihuocheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeijihuocheView;


/**
 * 飞机火车
 *
 * @author 
 * @email 
 * @date 2021-03-24 20:47:41
 */
public interface FeijihuocheService extends IService<FeijihuocheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeijihuocheVO> selectListVO(Wrapper<FeijihuocheEntity> wrapper);
   	
   	FeijihuocheVO selectVO(@Param("ew") Wrapper<FeijihuocheEntity> wrapper);
   	
   	List<FeijihuocheView> selectListView(Wrapper<FeijihuocheEntity> wrapper);
   	
   	FeijihuocheView selectView(@Param("ew") Wrapper<FeijihuocheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeijihuocheEntity> wrapper);
   	
}

