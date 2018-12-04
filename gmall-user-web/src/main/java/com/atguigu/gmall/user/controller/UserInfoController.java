package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yhfstart
 * @create 2018-12-01 13:50
 */

@RestController
public class UserInfoController {

    @com.alibaba.dubbo.config.annotation.Reference
    UserInfoService userInfoService;

    @RequestMapping("/get/user/info/all")
    public List<UserInfo> getUserInfoAll(){
        List<UserInfo> userInfoAll = userInfoService.getUserInfoAll();
        userInfoAll.forEach(System.out::println);
        return    userInfoService.getUserInfoAll();
    }

    @RequestMapping("/get/user/info/single")
    public UserInfo getUserByKey(@RequestParam(name = "id",required = false,defaultValue = "1") String id){
        UserInfo userInfo = userInfoService.selectByPrimaryKey(id);
        return userInfoService.selectByPrimaryKey(id);
    }

    @RequestMapping("/get/user/info/alladdress")
    public List<UserInfo> getUserInfoAllAddress(){
        System.out.print(userInfoService);
        return  userInfoService.getAllUserAndAddress();
    }




}

