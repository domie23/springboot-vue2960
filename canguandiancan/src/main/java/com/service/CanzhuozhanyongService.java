package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanzhuozhanyongEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 餐桌占用 服务类
 */
public interface CanzhuozhanyongService extends IService<CanzhuozhanyongEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}