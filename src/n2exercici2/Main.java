package n2exercici2;

import java.util.TreeSet;

public class Main {
    public static void main (String[] args) {
        System.out.println("Creem 4 restaurants i els afegim, en cap ordre en particular, a un TreeSet:");
        System.out.println("Ca la Iaia, puntuació = 10");
        System.out.println("La Cantonada, puntuació = 7");
        System.out.println("Ca la Iaia, puntuació = 8");
        System.out.println("Voramar, puntuació = 7");
        System.out.println();

        TreeSet<Restaurant> restaurants = new TreeSet<>();
        restaurants.add(new Restaurant("Ca la Iaia", 10));
        restaurants.add(new Restaurant("La Cantonada", 7));
        restaurants.add(new Restaurant("Ca la Iaia", 8));
        restaurants.add(new Restaurant("Voramar", 7));

        System.out.println("Queden ordenats per nom i puntuació:");
        for (Restaurant r: restaurants) {
            System.out.println(r);
        }
    }
}
