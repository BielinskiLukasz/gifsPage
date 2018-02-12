package com.bielinski.kwejk.contoller;

import com.bielinski.kwejk.model.Gif;
import com.bielinski.kwejk.repository.CategoryRepository;
import com.bielinski.kwejk.repository.GifRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
    private CategoryRepository categoryRepository = new CategoryRepository();
    private GifRepository gifRepository = new GifRepository();

    @GetMapping("/categories")
    public String displayAll(Model modelMap) {
        modelMap.addAttribute("categories", categoryRepository.findAll());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String displayCategory(@PathVariable int id, ModelMap modelMap){
        modelMap.addAttribute("category",categoryRepository.findByCategoryId(id));
        modelMap.addAttribute("gifs",gifRepository.findByCategoryId(id));
        return "category";
    }
}
