package com.amlgam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dima on 07.03.16.
 */
@Controller
public class HomeController
{
    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/register")
    public String register()
    {
        return null;
    }
}
