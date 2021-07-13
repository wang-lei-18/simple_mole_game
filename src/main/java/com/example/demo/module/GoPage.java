package com.example.demo.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/go")
public class GoPage {

    @RequestMapping("/mole")
    public String goMole() {
        return "module/mole";
    }
}
