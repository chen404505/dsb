package com.dsb.pms.dao;

import com.dsb.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenzhenghuai
 * @email chen404505@qq.com
 * @date 2020-04-07 10:48:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
