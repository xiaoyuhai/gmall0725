package com.atguigu.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yhfstart
 * @create 2018-12-02 10:42
 */

@Controller
public class ManagerIndexController {

    @RequestMapping("/index")
    public String indexController(){
        return "index";
    }
    @RequestMapping("/index1")
    public String indexController1(){
        return "index1";
    }
}
