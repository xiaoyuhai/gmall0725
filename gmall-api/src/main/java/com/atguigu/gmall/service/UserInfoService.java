package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

/**
 * @author yhfstart
 * @create 2018-12-01 14:05
 */
public interface UserInfoService {
    public List<UserInfo> getUserInfoAll();

    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    public List<UserInfo> getAllUserAndAddress();
}
