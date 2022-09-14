package com.ding.ding.miao.server.service.user;

import com.ding.ding.miao.server.common.WeChatApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private WeChatApi weChatApi;

    @Override
    public Boolean addUser(String code) {
        weChatApi.getUserPhone(code);

        return true;
    }
}
