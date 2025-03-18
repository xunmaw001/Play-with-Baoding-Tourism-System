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


import com.dao.DiscussjingquxianluDao;
import com.entity.DiscussjingquxianluEntity;
import com.service.DiscussjingquxianluService;
import com.entity.vo.DiscussjingquxianluVO;
import com.entity.view.DiscussjingquxianluView;

@Service("discussjingquxianluService")
public class DiscussjingquxianluServiceImpl extends ServiceImpl<DiscussjingquxianluDao, DiscussjingquxianluEntity> implements DiscussjingquxianluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingquxianluEntity> page = this.selectPage(
                new Query<DiscussjingquxianluEntity>(params).getPage(),
                new EntityWrapper<DiscussjingquxianluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingquxianluEntity> wrapper) {
		  Page<DiscussjingquxianluView> page =new Query<DiscussjingquxianluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingquxianluVO> selectListVO(Wrapper<DiscussjingquxianluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingquxianluVO selectVO(Wrapper<DiscussjingquxianluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingquxianluView> selectListView(Wrapper<DiscussjingquxianluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingquxianluView selectView(Wrapper<DiscussjingquxianluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
