package com.recipesystem;

import com.recipesystem.recipe.ImmutableRecipe;
import com.recipesystem.recipe.ProxyRecipe;
import com.recipesystem.recipe.Recipe;

public class Main {
    public static void main(String[] args) {
        ImmutableRecipe immutableRecipe = new ImmutableRecipe("Instruction: 3 times a day after meal", 10);
        ProxyRecipe proxyRecipe = new ProxyRecipe(immutableRecipe);
        proxyRecipe.setExpirationDate(15);

        System.out.println(immutableRecipe + "\n");
        System.out.println(proxyRecipe);
    }
}
