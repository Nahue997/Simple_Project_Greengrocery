package org.nahuelgonzalez.greengrocery.main;

import org.nahuelgonzalez.greengrocery.models.*;

public class MainGreengrocery {
    public static void main(String[] args) {

        Product[] products = new Product[8];

        products[0] = new Fruit("Banana", 1.55,1.0,"Yellow" );
        products[1] = new Fruit("Pineapple", 1.60, 1.2, "Yellow");
        products[2] = new Dairy("Milk",1.17,3,32);
        products[3] = new Dairy("Cheese", 1.72, 2,228);
        products[4] = new Cleaning("Clorox",10.49,"Disinfecting wipes clean and disinfect",4.9);
        products[5] = new Cleaning("Affresh", 6.99,"Dishwasher Cleaner, Helps Remove, Limescale and Odor-Causing Residue", 0.5);
        products[6] = new Nonperishable("Hormel Compleats",23.66,9,460);
        products[7] = new Nonperishable("Quaker Instant Oatmeal", 71.136,48,40);


        System.out.println("=======PRODUCTS=======");
        for(Object o: products){
            System.out.println(o);
        }

        System.out.println("\n=======END=======");

    }
}
