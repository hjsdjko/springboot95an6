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


import com.dao.ZhenliaofanganDao;
import com.entity.ZhenliaofanganEntity;
import com.service.ZhenliaofanganService;
import com.entity.vo.ZhenliaofanganVO;
import com.entity.view.ZhenliaofanganView;

@Service("zhenliaofanganService")
public class ZhenliaofanganServiceImpl extends ServiceImpl<ZhenliaofanganDao, ZhenliaofanganEntity> implements ZhenliaofanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhenliaofanganEntity> page = this.selectPage(
                new Query<ZhenliaofanganEntity>(params).getPage(),
                new EntityWrapper<ZhenliaofanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhenliaofanganEntity> wrapper) {
		  Page<ZhenliaofanganView> page =new Query<ZhenliaofanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhenliaofanganVO> selectListVO(Wrapper<ZhenliaofanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhenliaofanganVO selectVO(Wrapper<ZhenliaofanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhenliaofanganView> selectListView(Wrapper<ZhenliaofanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhenliaofanganView selectView(Wrapper<ZhenliaofanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
