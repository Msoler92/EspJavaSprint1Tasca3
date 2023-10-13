package n2exercici2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] args) {
        System.out.println("Creem 4 restaurants");
        System.out.println("Ca la Iaia, puntuació = 10");
        System.out.println("La Cantonada, puntuació = 7");
        System.out.println("Ca la Iaia, puntuació = 8");
        System.out.println("Voramar, puntuació = 7");

        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Ca la Iaia", 10));
        restaurants.add(new Restaurant("La Cantonada", 7));
        restaurants.add(new Restaurant("Ca la Iaia", 8));
        restaurants.add(new Restaurant("Voramar", 7));

        System.out.println("Ordenem la llista:");
        Collections.sort(restaurants);
        for (Restaurant r: restaurants) {
            System.out.println(r);
        }
    }
}
