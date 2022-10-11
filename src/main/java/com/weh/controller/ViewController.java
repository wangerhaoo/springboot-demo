package com.weh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * controller 返回的是页面 注解相关的测试
 *
 */
@Controller
public class ViewController {
    /**
     * 不带数据返回页面
     */
    @RequestMapping("view") //  http://localhost:8080/view
    public  String view(){
        return "view";
    }

    /**
     * 带数据返回页面
     */
    @RequestMapping("data") //  http://localhost:8080/data
    public ModelAndView data(){
        ModelAndView dataView =new ModelAndView("data");

        dataView.addObject("str1","我叫");
        return dataView;
    }
}
