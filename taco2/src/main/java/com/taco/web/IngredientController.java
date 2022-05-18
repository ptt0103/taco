package com.taco.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taco.Ingredient;
import com.taco.database.IngredientRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path="/ingredients", produces="application/json")
public class IngredientController {
	private final IngredientRepository ingredientRepo;

	@Autowired
	public IngredientController(IngredientRepository ingredientRepo) {

		this.ingredientRepo = ingredientRepo;
	}
	
	@GetMapping
	public Iterable<Ingredient> getAllIngredients() {
		return ingredientRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Ingredient ingredientById(@PathVariable("id") String id) {
		Optional<Ingredient> ingredient = ingredientRepo.findById(id);
		if(ingredient.isPresent()) {
			return ingredient.get();
		}
		return null;
	}
}
