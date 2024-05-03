package com.dao;

import com.entity.ZhenliaofanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhenliaofanganVO;
import com.entity.view.ZhenliaofanganView;


/**
 * 诊疗方案
 * 
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
public interface ZhenliaofanganDao extends BaseMapper<ZhenliaofanganEntity> {
	
	List<ZhenliaofanganVO> selectListVO(@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);
	
	ZhenliaofanganVO selectVO(@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);
	
	List<ZhenliaofanganView> selectListView(@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);

	List<ZhenliaofanganView> selectListView(Pagination page,@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);
	
	ZhenliaofanganView selectView(@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);
	

}
