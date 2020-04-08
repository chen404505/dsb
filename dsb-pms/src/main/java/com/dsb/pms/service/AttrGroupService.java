package com.dsb.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 10:48:44
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

