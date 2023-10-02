package n1exercici3;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countries = readMap("src/n1exercici3/countries.txt");
        String userName = Entrada.llegirString("Introdueixi el nom de l'usuari/ària:");
        Game partida = new Game(userName, countries);
        partida.play();

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