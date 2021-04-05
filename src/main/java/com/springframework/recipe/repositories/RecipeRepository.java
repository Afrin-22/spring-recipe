package com.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
