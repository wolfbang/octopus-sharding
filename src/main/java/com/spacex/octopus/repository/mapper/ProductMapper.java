package com.spacex.octopus.repository.mapper;

import com.spacex.octopus.repository.po.ProductPO;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ProductMapper extends Mapper<ProductPO> {
}