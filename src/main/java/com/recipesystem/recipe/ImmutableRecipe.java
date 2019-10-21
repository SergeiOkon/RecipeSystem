package com.recipesystem.recipe;

public class ImmutableRecipe implements Recipe {

    private final String instruction;
    private final int expirationDate;

    public ImmutableRecipe(String instruction, int expirationDate) {
        this.instruction = instruction;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getInstruction() {
        return instruction;
    }

    @Override
    public int getExpirationDate() {
        return expirationDate;
    }


    @Override
    public String toString() {
        return "Recipe. \n" + instruction +
                "; \nExpiration Date: " + expirationDate +
                " days";
    }
}
