package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhenliaofanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhenliaofanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhenliaofanganView;


/**
 * 诊疗方案
 *
 * @author 
 * @email 
 * @date 2022-02-23 18:23:12
 */
public interface ZhenliaofanganService extends IService<ZhenliaofanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhenliaofanganVO> selectListVO(Wrapper<ZhenliaofanganEntity> wrapper);
   	
   	ZhenliaofanganVO selectVO(@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);
   	
   	List<ZhenliaofanganView> selectListView(Wrapper<ZhenliaofanganEntity> wrapper);
   	
   	ZhenliaofanganView selectView(@Param("ew") Wrapper<ZhenliaofanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhenliaofanganEntity> wrapper);
   	

}

