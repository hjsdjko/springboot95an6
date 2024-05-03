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


import com.dao.YuyueyishengDao;
import com.entity.YuyueyishengEntity;
import com.service.YuyueyishengService;
import com.entity.vo.YuyueyishengVO;
import com.entity.view.YuyueyishengView;

@Service("yuyueyishengService")
public class YuyueyishengServiceImpl extends ServiceImpl<YuyueyishengDao, YuyueyishengEntity> implements YuyueyishengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueyishengEntity> page = this.selectPage(
                new Query<YuyueyishengEntity>(params).getPage(),
                new EntityWrapper<YuyueyishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueyishengEntity> wrapper) {
		  Page<YuyueyishengView> page =new Query<YuyueyishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyueyishengVO> selectListVO(Wrapper<YuyueyishengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyueyishengVO selectVO(Wrapper<YuyueyishengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyueyishengView> selectListView(Wrapper<YuyueyishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueyishengView selectView(Wrapper<YuyueyishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
