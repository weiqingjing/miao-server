package com.ding.ding.miao.server.mapper;

import com.ding.ding.miao.server.domain.entity.UserBase;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserBaseMapperTest {
    @Resource
    private UserBaseMapper userBaseMapper;

    @Test
    void deleteByPrimaryKey() {
    }

    @Rollback(false)//Mybatis框架会默认回滚事务，显示设置不回滚事务
    @Test
    void insert() {
        UserBase userBase = new UserBase();
        userBase.setMobile("17311112222");
        userBase.setOpenId("1111111111111111111111111128");
        userBase.setUnionId("1111111111111111111111111129");
        int row = userBaseMapper.insert(userBase);
        System.out.println(row);
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
        UserBase userBase =  userBaseMapper.selectByPrimaryKey(1L);
        System.out.println(userBase);
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }
}