package com.weh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    /**
     * 不带数据返回页面
     */
    @RequestMapping("view") //  http://localhost:8080/view
    public  String view(){
        return "view";
    }
}
