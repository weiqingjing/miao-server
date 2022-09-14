package com.ding.ding.miao.server.mapper;

import com.ding.ding.miao.server.domain.entity.UserBase;

public interface UserBaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    UserBase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);
}