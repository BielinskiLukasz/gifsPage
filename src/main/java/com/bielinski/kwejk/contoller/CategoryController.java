package com.bielinski.kwejk.contoller;

import com.bielinski.kwejk.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    private CategoryRepository categoryRepository = new CategoryRepository();

    @GetMapping("/categories")
    public String displayAll(Model modelMap) {
        modelMap.addAttribute("categories", categoryRepository.findAll());
        return "categories";
    }
}
