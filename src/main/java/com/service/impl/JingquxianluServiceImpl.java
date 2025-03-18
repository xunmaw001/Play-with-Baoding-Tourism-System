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


import com.dao.JingquxianluDao;
import com.entity.JingquxianluEntity;
import com.service.JingquxianluService;
import com.entity.vo.JingquxianluVO;
import com.entity.view.JingquxianluView;

@Service("jingquxianluService")
public class JingquxianluServiceImpl extends ServiceImpl<JingquxianluDao, JingquxianluEntity> implements JingquxianluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingquxianluEntity> page = this.selectPage(
                new Query<JingquxianluEntity>(params).getPage(),
                new EntityWrapper<JingquxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingquxianluEntity> wrapper) {
		  Page<JingquxianluView> page =new Query<JingquxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingquxianluVO> selectListVO(Wrapper<JingquxianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingquxianluVO selectVO(Wrapper<JingquxianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingquxianluView> selectListView(Wrapper<JingquxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingquxianluView selectView(Wrapper<JingquxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
