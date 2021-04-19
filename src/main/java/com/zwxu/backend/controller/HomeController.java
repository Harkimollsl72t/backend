package com.zwxu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zwxu.backend.model.LearnResouce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tengj on 2017/3/7.
 */
@Controller
@RequestMapping("/index")
public class HomeController {

    @RequestMapping("")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/admin")
    public String admin(){
        return "admin/starter";
    }
}
