package com.recipesystem.recipe;

public class ProxyRecipe implements Recipe {

    private ImmutableRecipe basicRecipe;
    private Integer updatedExpirationDate;


    public ProxyRecipe(ImmutableRecipe realRecipe) {
        this.basicRecipe = realRecipe;
    }

    public void setExpirationDate(Integer updatedExpiryDate) {
        this.updatedExpirationDate = updatedExpiryDate;
    }

    @Override
    public String getInstruction() {
        return basicRecipe.getInstruction();
    }

    @Override
    public int getExpirationDate() {
        if (updatedExpirationDate != null) {
            return updatedExpirationDate;
        }
        return basicRecipe.getExpirationDate();
    }

    @Override
    public String toString() {
        return "Recipe. \n" + basicRecipe.getInstruction() +
                "; \nExpiration Date: " + updatedExpirationDate +
                " days";
    }
}
