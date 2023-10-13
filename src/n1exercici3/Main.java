package n1exercici3;
import n1exercici3.utils.Entrada;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        //Inicialitza el joc
        Game partida = new Game(Entrada.llegirString("Introdueixi el nom de l'usuari/ària:"), readMap("src\\n1exercici3\\resources\\countries.txt"));

        //Executa el joc
        partida.play();

        //Guarda els resultats en un fitxer .txt (si el fitxer no existeix, el crea. Si ja existeix, hi afegeix els nous resultats).
        try {
            File classificacio = new File("src\\n1exercici3\\resources\\classificacio.txt");
            if (classificacio.createNewFile() || classificacio.exists()) {
                FileWriter writer = new FileWriter("src\\n1exercici3\\resources\\classificacio.txt", true);
                writer.write("Usuari/ària: " + partida.getUsername() + ". Puntuació: " + partida.getScore() + ".\n");
                writer.close();
            } else {
                System.out.println("Could not create file.");
            }
        } catch (IOException e) {
            System.err.println("Unexpected IOException.");
            e.printStackTrace();
        }
    }

    //Llegeix línia a línia l'arxiu referit per paràmetre i l'emmagatzema en un HashMap.
    // Si el format d'una línia no es correspon amb el patró String + " " + String, printa un avís d'error però no s'atura.
    public static HashMap<String, String> readMap(String pathname) {
        HashMap<String, String> returnMap = new HashMap<>();
        String[] keyValuePair;
        String lineInput;
        int lineCounter = 0;
        try {
            File file = new File(pathname);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                lineInput = sc.nextLine();
                keyValuePair = lineInput.split(" ");
                if (keyValuePair.length != 2) {
                    System.out.println("Error de format a la línia " + lineCounter);
                }
                else {
                    returnMap.put(keyValuePair[0], keyValuePair[1]);
                }
                lineCounter++;
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        return returnMap;
    }

}