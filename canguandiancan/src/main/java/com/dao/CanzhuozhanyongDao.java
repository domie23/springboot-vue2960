package com.dao;

import com.entity.CanzhuozhanyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CanzhuozhanyongView;

/**
 * 餐桌占用 Dao 接口
 *
 * @author 
 */
public interface CanzhuozhanyongDao extends BaseMapper<CanzhuozhanyongEntity> {

   List<CanzhuozhanyongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
