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


import com.dao.MenpiaoleixingDao;
import com.entity.MenpiaoleixingEntity;
import com.service.MenpiaoleixingService;
import com.entity.vo.MenpiaoleixingVO;
import com.entity.view.MenpiaoleixingView;

@Service("menpiaoleixingService")
public class MenpiaoleixingServiceImpl extends ServiceImpl<MenpiaoleixingDao, MenpiaoleixingEntity> implements MenpiaoleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenpiaoleixingEntity> page = this.selectPage(
                new Query<MenpiaoleixingEntity>(params).getPage(),
                new EntityWrapper<MenpiaoleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenpiaoleixingEntity> wrapper) {
		  Page<MenpiaoleixingView> page =new Query<MenpiaoleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenpiaoleixingVO> selectListVO(Wrapper<MenpiaoleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenpiaoleixingVO selectVO(Wrapper<MenpiaoleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenpiaoleixingView> selectListView(Wrapper<MenpiaoleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenpiaoleixingView selectView(Wrapper<MenpiaoleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
