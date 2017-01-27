package com.tong.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("main")
public class MainController {

    @RequestMapping(value = {"init"}, method = RequestMethod.GET)
    public ModelAndView init(HttpServletRequest request) {
        String param = request.getParameter("param");
        System.out.println(param);
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        return model;

    }

}