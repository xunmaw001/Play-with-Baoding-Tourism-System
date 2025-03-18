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


import com.dao.FeijihuocheDao;
import com.entity.FeijihuocheEntity;
import com.service.FeijihuocheService;
import com.entity.vo.FeijihuocheVO;
import com.entity.view.FeijihuocheView;

@Service("feijihuocheService")
public class FeijihuocheServiceImpl extends ServiceImpl<FeijihuocheDao, FeijihuocheEntity> implements FeijihuocheService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeijihuocheEntity> page = this.selectPage(
                new Query<FeijihuocheEntity>(params).getPage(),
                new EntityWrapper<FeijihuocheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeijihuocheEntity> wrapper) {
		  Page<FeijihuocheView> page =new Query<FeijihuocheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeijihuocheVO> selectListVO(Wrapper<FeijihuocheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeijihuocheVO selectVO(Wrapper<FeijihuocheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeijihuocheView> selectListView(Wrapper<FeijihuocheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeijihuocheView selectView(Wrapper<FeijihuocheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
