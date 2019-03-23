package com.guanhetingyu.www.controller;

import com.guanhetingyu.api.base.BaseResult;
import com.guanhetingyu.api.base.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午3:05
 * Description:
 */
@Controller
public class MonitorController {
    private static final Logger log = LoggerFactory.getLogger(MonitorController.class);

    @RequestMapping(value = "/check")
    @ResponseBody
    public Result check(){
        return BaseResult.success();
    }
}
