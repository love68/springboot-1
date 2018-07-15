package com.study.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "hello1111";
    }

    @RequestMapping("firstController")
    public ModelAndView firstController(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

}
