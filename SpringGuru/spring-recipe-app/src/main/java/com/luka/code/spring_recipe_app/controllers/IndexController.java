package com.luka.code.spring_recipe_app.controllers;

import com.luka.code.spring_recipe_app.domain.Category;
import com.luka.code.spring_recipe_app.domain.Ingredient;
import com.luka.code.spring_recipe_app.repositories.CategoryRepository;
import com.luka.code.spring_recipe_app.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index", "index.html"})
    public String getIndexPage(){
        Optional<Category> optionalCategory=categoryRepository.findByDescription("American");
        Optional<Ingredient.UnitOfMeasure> optionalUnitOfMeasure=unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is: "+optionalCategory.get().getId());
        System.out.println("UoM id is: "+optionalUnitOfMeasure.get().getId());
        return "index";
    }
}
