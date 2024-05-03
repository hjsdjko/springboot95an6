package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuzhenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuzhenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuzhenxinxiView;


/**
 * 就诊信息
 *
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
public interface JiuzhenxinxiService extends IService<JiuzhenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuzhenxinxiVO> selectListVO(Wrapper<JiuzhenxinxiEntity> wrapper);
   	
   	JiuzhenxinxiVO selectVO(@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);
   	
   	List<JiuzhenxinxiView> selectListView(Wrapper<JiuzhenxinxiEntity> wrapper);
   	
   	JiuzhenxinxiView selectView(@Param("ew") Wrapper<JiuzhenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuzhenxinxiEntity> wrapper);
   	

}

