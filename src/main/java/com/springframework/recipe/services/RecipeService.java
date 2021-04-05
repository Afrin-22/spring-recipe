package com.springframework.recipe.services;

import java.util.Set;

import com.springframework.recipe.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
}
