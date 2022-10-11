package com.weh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面传参 path类型
 */
@Controller
public class PathController {
    @RequestMapping("/path/{id}/path/{type}")
    public  ModelAndView params(@PathVariable(required = false) int id,
                                @PathVariable(required = false) String type){
        ModelAndView pathView =new ModelAndView("path");
        System.out.println("id"+id);
        System.out.println("type"+type);

        pathView.addObject("id",id);
        pathView.addObject("type",type);

        return pathView;
    }
}
