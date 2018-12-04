package com.atguigu.gmall.manager.controller;

import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.ManagerService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @author yhfstart
 * @create 2018-12-02 17:31
 */
@RestController
public class AttraListPaggeController {


    @com.alibaba.dubbo.config.annotation.Reference
    ManagerService managerService;
    @RequestMapping("attrListPage")
    public ModelAndView getAttrListPage() {
        ModelAndView modelAndView = new ModelAndView("attrListPage");
        return modelAndView;
    }

    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){
        return managerService.getCatalog1();
    }
    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        return managerService.getCatalog2(catalog1Id);
    }
    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        return managerService.getCatalog3(catalog2Id);
    }
    @RequestMapping("getAttrList")
    public List<BaseAttrInfo> getAttrList(String catalog3Id){

        return managerService.getAttrList(catalog3Id);
    }


    @RequestMapping(value = "getAttrValueList",method = RequestMethod.POST)
    @ResponseBody
    public List<BaseAttrValue> getAttrValueList(@RequestParam Map<String,String> map){
        String attrId= map.get("attrId");
        BaseAttrInfo attrInfo = managerService.getAttrInfo(attrId);
        return attrInfo.getAttrValueList();
    }



    @RequestMapping(value = "saveAttrInfo",method = RequestMethod.POST)
    @ResponseBody
    public String saveAttrInfo(BaseAttrInfo baseAttrInfo){
        managerService.saveAttrInfo(baseAttrInfo);
        return "success";
    }








}
