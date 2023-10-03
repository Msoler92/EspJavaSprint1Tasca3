package n1exercici3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Game partida = new Game(Entrada.llegirString("Introdueixi el nom de l'usuari/ària:"), readMap("src/n1exercici3/countries.txt"));
        partida.play();
        try {
            File classificacio = new File("src/n1exercici3/classificacio.txt");
            classificacio.createNewFile();
            FileWriter writer = new FileWriter ("src/n1exercici3/classificacio.txt", true);
            writer.write("Usuari/ària: " + partida.getUsername() + ". Puntuació: " + partida.getScore() + ".\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("Unhandled IOException.");
        }

    }

    public static HashMap<String, String> readMap(String pathname) {
        HashMap<String, String> returnMap = new HashMap<>();
        String[] keyValuePair;
        try {
            File file = new File(pathname);
            Scanner sc = new Scanner(file);
            String lineInput;
            while (sc.hasNextLine()) {
                lineInput = sc.nextLine();
                keyValuePair = lineInput.split(" ");
                if (keyValuePair.length != 2) {
                    System.out.println(keyValuePair[0]);
                    System.out.println("Error");
                }
                else {
                    returnMap.put(keyValuePair[0], keyValuePair[1]);
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        return returnMap;
    }

}