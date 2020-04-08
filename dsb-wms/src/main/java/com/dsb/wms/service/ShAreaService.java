package com.dsb.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.wms.entity.ShAreaEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 17:12:01
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

