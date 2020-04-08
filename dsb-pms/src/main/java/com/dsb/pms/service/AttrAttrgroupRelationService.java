package com.dsb.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 10:48:44
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

