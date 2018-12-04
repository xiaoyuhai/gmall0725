package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author yhfstart
 * @create 2018-12-01 12:31
 */


public interface UserInfoMapper extends Mapper<UserInfo> {

   public List<UserInfo> selectAllUserAndAddress();
}
