package com.morrisje.services;

import com.morrisje.commands.RecipeCommand;
import com.morrisje.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
