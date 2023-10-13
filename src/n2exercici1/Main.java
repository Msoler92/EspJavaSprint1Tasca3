package n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main (String[] args) {
        System.out.println("Creem 4 restaurants");
        System.out.println("Ca la Iaia, puntuació = 1");
        System.out.println("La Cantonada, puntuació = 2");
        System.out.println("Ca la Iaia, puntuació = 2");
        System.out.println("Ca la Iaia, puntuació = 1");

        System.out.println("Afegim els 4 restaurants a un HashSet. " +
                "Degut a que la quarta entrada és igual a la primera (segons els criteris de l'exercici), " +
                "aquesta no s'emmagatzema en el HashSet.");

        HashSet<Restaurant> hs = new HashSet<>();
        hs.add(new Restaurant("Ca la Iaia", 1));
        hs.add(new Restaurant("La Cantonada", 2));
        hs.add(new Restaurant("Ca la Iaia", 2));
        hs.add(new Restaurant("Ca la Iaia", 1));

        for (Restaurant r: hs) {
            System.out.println(r);
        }
    }
}
