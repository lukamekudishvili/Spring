package com.luka.code.spring_recipe_app.repositories;

import com.luka.code.spring_recipe_app.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
