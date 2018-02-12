package com.bielinski.kwejk.contoller;

import com.bielinski.kwejk.model.Gif;
import com.bielinski.kwejk.repository.GifRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GifApiController {
    private GifRepository gifRepository = new GifRepository();

    @GetMapping("/api/gifs")
    public List<Gif> gifs(){
        return gifRepository.findAll();
    }

    @GetMapping("/api/gifs/find")
    public List<Gif> findGifs(@RequestParam String name){
        return gifRepository.findAllByNameIgnoreCase(name);
    }
}
