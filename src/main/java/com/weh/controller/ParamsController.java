package com.weh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面传参
 */
@Controller
public class ParamsController {
    @RequestMapping("params")
    public  ModelAndView params(@RequestParam(value = "id",required = false,defaultValue = "0") int id,
                                @RequestParam(value = "type",required = false,defaultValue = "") String type){
        ModelAndView paramsView =new ModelAndView("params");
        System.out.println("id"+id);
        System.out.println("type"+type);

        paramsView.addObject("id",id);
        paramsView.addObject("type",type);

        return paramsView;
    }
}
