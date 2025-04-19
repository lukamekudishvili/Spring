package com.luka.code.spring_recipe_app.repositories;

import com.luka.code.spring_recipe_app.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<Ingredient.UnitOfMeasure,Long> {
    Optional<Ingredient.UnitOfMeasure> findByDescription(String description);
}
