package com.bielinski.kwejk.contoller;

import com.bielinski.kwejk.model.Gif;
import com.bielinski.kwejk.repository.GifRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private GifRepository gifRepository = new GifRepository();

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("gifs", gifRepository.findAll());
        return "home";
    }
}
