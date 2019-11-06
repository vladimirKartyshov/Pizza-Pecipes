package com.example.pizzarecipes;

public class PizzaRecipeItem {

    private int imageResource;
    private String title;
    private String description;

    public PizzaRecipeItem(int imageResource, String title, String description) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
