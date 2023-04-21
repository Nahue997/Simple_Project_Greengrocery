package org.nahuelgonzalez.greengrocery.models;

public class Nonperishable extends Product{

    private int content;
    private int calories;

    public Nonperishable(String name, Double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nContent= " + content +
                "\nCalories= " + calories;
    }
}
