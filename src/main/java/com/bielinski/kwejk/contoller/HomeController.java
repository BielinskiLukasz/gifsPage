package com.bielinski.kwejk.contoller;

import com.bielinski.kwejk.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("gif", new Gif("compiler-bot"));
        return "home";
    }
}
