package com.dsb.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsb.pms.entity.SpuCommentEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 10:48:44
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

