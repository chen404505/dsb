package com.dsb.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.pms.entity.SkuSaleAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku销售属性&值
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 10:48:44
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

