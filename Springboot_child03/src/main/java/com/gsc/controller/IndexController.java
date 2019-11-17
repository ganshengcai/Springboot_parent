package com.gsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String show( Model model) {
        model.addAttribute("name", "ga短发sdf");
        return "index";
    }
}
