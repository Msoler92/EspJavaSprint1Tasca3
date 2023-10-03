package n1exercici3;

import java.util.HashMap;
import java.util.ArrayList;

public class Game {
    private String username;
    private HashMap<String, String> countries;

    private int score;

    public Game (String username, HashMap<String, String> countries) {
        this.username = username;
        this.countries = countries;
        score = 0;
    }
    public String getUsername () {
        return username;
    }

    public int getScore() {
        return score;
    }

    public void play() {
        int length = countries.size();
        String countryToGuess;
        ArrayList<String> keys = new ArrayList<>(countries.keySet());
        for (int i = 0; i < 10; i++) {
            countryToGuess = keys.get((int) (Math.random()* (length - i)));
            if (countries.get(countryToGuess).equals(Entrada.llegirString(i+1 + ".- What's the capital of " + countryToGuess + "?"))) {
                System.out.println("Correct.");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
            countries.remove(countryToGuess);
            keys.remove(countryToGuess);
        }
    }
}
