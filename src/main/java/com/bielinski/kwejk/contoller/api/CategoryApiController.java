package com.bielinski.kwejk.contoller.api;

import com.bielinski.kwejk.model.Category;
import com.bielinski.kwejk.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryApiController {
    private CategoryRepository categoryRepository = new CategoryRepository();

    @GetMapping("/api/categories")
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

//    @GetMapping("/api/categories/find")
//    public List<Category> findAllByName(@RequestParam String name){
//        return categoryRepository.findCategoriesByNameIgnoreCase(name);
//    }

    @GetMapping("/api/categories/find")
    public List<Category> findAllByName(@RequestParam String name) {
        List<Category> categories = categoryRepository.findCategoriesByNameIgnoreCase(name);
        if (categories.isEmpty())
            return categoryRepository.findAll();
        else
            return categoryRepository.findCategoriesByNameIgnoreCase(name);
    }
}
