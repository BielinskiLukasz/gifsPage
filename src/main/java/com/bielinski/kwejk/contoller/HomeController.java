package com.bielinski.kwejk.contoller;

import com.bielinski.kwejk.model.Gif;
import com.bielinski.kwejk.repository.GifRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    private GifRepository gifRepository = new GifRepository();

    @GetMapping("/")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String getFavorites(ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifRepository.findFavorites());
        return "favorites";
    }

    @GetMapping("/gif/{name}")
    public String displayGif(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif", gifRepository.findByName(name).orElse(new Gif("android-explosion", true)));
        return "gif-details";
    }

    @GetMapping("/gif/{name}/favorite")
    public String isFavouriteGifChange(@PathVariable String name, ModelMap modelMap) {
        gifRepository.findByName(name).orElse(new Gif("android-explosion", true)).changeFavorite();
        modelMap.addAttribute("gif", gifRepository.findByName(name).orElse(new Gif("android-explosion", true)));
        return "gif-details";
    }

    @GetMapping("/gifs/search")
    public String searchGif(@RequestParam String q, ModelMap modelMap) {
        List<Gif> gifList = gifRepository.findAllByNameIgnoreCase(q);
        if (gifList.isEmpty()) {
            modelMap.addAttribute("gifs", gifRepository.findAll());
        } else {
            modelMap.addAttribute("gifs", gifList);
        }
        return "home";
    }
}
