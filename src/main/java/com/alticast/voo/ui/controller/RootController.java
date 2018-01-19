package com.alticast.voo.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class RootController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getRoot(){
        return "index";
    }
}
