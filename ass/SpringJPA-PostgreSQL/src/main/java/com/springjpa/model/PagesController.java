package com.springjpa.model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
    @RequestMapping("/")
    public String startPage()
    {
        return "login";
    }

    @RequestMapping("/login")
        public String loginPage()
    {
        return "login";
    }



}
