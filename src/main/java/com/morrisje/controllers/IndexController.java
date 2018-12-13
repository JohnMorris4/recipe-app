package com.morrisje.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jmorris on 12/13/18
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
