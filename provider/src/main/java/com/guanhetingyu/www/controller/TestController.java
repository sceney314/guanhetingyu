package com.guanhetingyu.www.controller;

import com.guanhetingyu.api.base.BaseResult;
import com.guanhetingyu.api.base.Result;
import com.guanhetingyu.www.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C), 2015-2018
 * Author:   zhengzp
 * Date:     2018/8/17 下午8:58
 * Description: 测试
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Man man;


    @RequestMapping(value = "/abtest")
    @ResponseBody
    public Result abtest(){
        man.getName();
        return BaseResult.success();
    }
}
