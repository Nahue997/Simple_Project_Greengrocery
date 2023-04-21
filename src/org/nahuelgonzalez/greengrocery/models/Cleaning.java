package org.nahuelgonzalez.greengrocery.models;

public class Cleaning extends Product{

    private String components;
    private double liters;

    public Cleaning(String name, Double price, String components, double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }


    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nComponents= " + components +
                "\nLiters= " + liters;
    }
}
