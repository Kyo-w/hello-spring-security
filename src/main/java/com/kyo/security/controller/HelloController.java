package com.kyo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author KyoDream
 * @2022/10/27
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return "administrator";
    }

    @RequestMapping("/forward")
    public String forward(String url) {
        return "forward:" + url;
    }

    @RequestMapping("/redirect")
    public String redirect(String url){
        return "redirect:" + url;
    }
}
