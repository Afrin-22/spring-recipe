package com.springframework.recipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@OneToOne
	private Recipe recipe;
	
	@Lob
	private String recipeNotes;
	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//	
//	public Recipe getRecipe() {
//		return recipe;
//	}
//	public String getDescription() {
//		return recipeNotes;
//	}
//	public void setRecipe(Recipe recipe) {
//		this.recipe = recipe;
//	}
//	public void setDescription(String description) {
//		this.recipeNotes = description;
//	}
//
//	public String getRecipeNotes() {
//		return recipeNotes;
//	}
//
//	public void setRecipeNotes(String recipeNotes) {
//		this.recipeNotes = recipeNotes;
//	}
//	
	
}
