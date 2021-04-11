package com.springframework.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.recipe.services.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

	@RequestMapping({"","/","/index"})
	public String getIndex(Model model) {
		
		 
		log.debug("Getting Index page...");

        model.addAttribute("recipes", recipeService.getRecipes());

		return "index";
	}
}
