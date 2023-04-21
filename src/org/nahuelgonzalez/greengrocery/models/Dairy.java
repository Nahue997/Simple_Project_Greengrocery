package org.nahuelgonzalez.greengrocery.models;

public class Dairy extends Product{

    private int quantity;
    private int proteins;

    public Dairy(String name, Double price, int quantity, int proteins) {
        super(name, price);
        this.quantity = quantity;
        this.proteins = proteins;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQuantity= " + quantity +
                "\nProteins= " + proteins;
    }
}
