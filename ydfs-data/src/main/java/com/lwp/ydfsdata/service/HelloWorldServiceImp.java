package com.lwp.ydfsdata.service;

import com.lwp.ydfsdata.dao.UserInfoMapper;
import com.lwp.ydfsdata.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImp implements HelloWorldService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo getUserByUserName(String username) {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(username);
        return userInfo;
    }
}
