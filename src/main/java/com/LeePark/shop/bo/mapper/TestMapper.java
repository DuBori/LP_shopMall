package com.LeePark.shop.bo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    public boolean isMyMember();
}
