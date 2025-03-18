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


import com.dao.DiscussfeijihuocheDao;
import com.entity.DiscussfeijihuocheEntity;
import com.service.DiscussfeijihuocheService;
import com.entity.vo.DiscussfeijihuocheVO;
import com.entity.view.DiscussfeijihuocheView;

@Service("discussfeijihuocheService")
public class DiscussfeijihuocheServiceImpl extends ServiceImpl<DiscussfeijihuocheDao, DiscussfeijihuocheEntity> implements DiscussfeijihuocheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfeijihuocheEntity> page = this.selectPage(
                new Query<DiscussfeijihuocheEntity>(params).getPage(),
                new EntityWrapper<DiscussfeijihuocheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfeijihuocheEntity> wrapper) {
		  Page<DiscussfeijihuocheView> page =new Query<DiscussfeijihuocheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfeijihuocheVO> selectListVO(Wrapper<DiscussfeijihuocheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfeijihuocheVO selectVO(Wrapper<DiscussfeijihuocheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfeijihuocheView> selectListView(Wrapper<DiscussfeijihuocheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfeijihuocheView selectView(Wrapper<DiscussfeijihuocheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
