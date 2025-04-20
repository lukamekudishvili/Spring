package com.luka.code.spring_recipe_app.services;

import com.luka.code.spring_recipe_app.domain.Recipe;
import com.luka.code.spring_recipe_app.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class recipeServiceImpl implements recipeService {
    private final RecipeRepository recipeRepository;

    public recipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> listRecipes(){
        List<Recipe> recipes=new ArrayList<>();
        recipeRepository.findAll().forEach(s->recipes.add(s));
        return recipes;
    }
}
