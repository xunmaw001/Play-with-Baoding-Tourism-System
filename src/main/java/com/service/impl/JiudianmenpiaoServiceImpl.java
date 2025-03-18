package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiudianmenpiaoDao;
import com.entity.JiudianmenpiaoEntity;
import com.service.JiudianmenpiaoService;
import com.entity.vo.JiudianmenpiaoVO;
import com.entity.view.JiudianmenpiaoView;

@Service("jiudianmenpiaoService")
public class JiudianmenpiaoServiceImpl extends ServiceImpl<JiudianmenpiaoDao, JiudianmenpiaoEntity> implements JiudianmenpiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianmenpiaoEntity> page = this.selectPage(
                new Query<JiudianmenpiaoEntity>(params).getPage(),
                new EntityWrapper<JiudianmenpiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianmenpiaoEntity> wrapper) {
		  Page<JiudianmenpiaoView> page =new Query<JiudianmenpiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianmenpiaoVO> selectListVO(Wrapper<JiudianmenpiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianmenpiaoVO selectVO(Wrapper<JiudianmenpiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianmenpiaoView> selectListView(Wrapper<JiudianmenpiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianmenpiaoView selectView(Wrapper<JiudianmenpiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
