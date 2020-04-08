package com.dsb.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.wms.entity.WareOrderTaskDetailEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 17:12:01
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

