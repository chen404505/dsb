package com.dsb.wms.dao;

import com.dsb.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 17:12:01
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
