package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yhfstart
 * @create 2018-12-01 14:06
 */

@com.alibaba.dubbo.config.annotation.Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> getUserInfoAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {

        return userInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UserInfo> getAllUserAndAddress() {
        return userInfoMapper.selectAllUserAndAddress();
    }


}
