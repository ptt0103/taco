package com.taco.database;

import org.springframework.data.repository.CrudRepository;

import com.taco.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
//	Iterable<Ingredient> findAll();
//	Ingredient findById(String id);
//	Ingredient save(Ingredient ingredient);
}
