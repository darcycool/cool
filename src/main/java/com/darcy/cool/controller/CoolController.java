package com.darcy.cool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhongyu.lv <lvzhongyu@yazuo.com>
 * @date 2019/3/18
 */
@RestController
public class CoolController {

    @RequestMapping("/cool")
    public String cool() {
        return "cool";
    }
}
