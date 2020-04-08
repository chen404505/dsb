package com.dsb.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.wms.entity.FeightTemplateEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 17:12:01
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

