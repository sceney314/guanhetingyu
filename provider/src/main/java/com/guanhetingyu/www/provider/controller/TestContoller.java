package com.guanhetingyu.www.provider.controller;

import com.guanhetingyu.api.base.BaseResult;
import com.guanhetingyu.api.base.Result;
import com.guanhetingyu.www.dispatcher.utils.PropertiesUtil;
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
@RequestMapping("/test/api")
public class TestContoller {

    @ResponseBody
    @RequestMapping(value = "/testProperty")
    public Result testProperty(){

        return BaseResult.success(PropertiesUtil.getPropertiesMap());
    }
}
