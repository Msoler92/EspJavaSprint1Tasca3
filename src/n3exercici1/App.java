package n3exercici1;

import n3exercici1.comparators.DniComparator;
import n3exercici1.comparators.NameComparator;
import n3exercici1.comparators.SurnamesComparator;
import n3exercici1.utils.Entrada;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class App {
    public static void main (String[] args) {
        ArrayList<Person> personList;
        int input = mainMenu();
        NameComparator nc = new NameComparator();
        SurnamesComparator sc = new SurnamesComparator();
        DniComparator dc = new DniComparator();
        while (input != 0) {
            switch (input) {
                case 1:
                    printToCsv(Entrada.llegirString("Nom:") + "," +
                            Entrada.llegirString("Primer cognom:") + " " + Entrada.llegirString("Segon cognom:") + "," +
                            Entrada.llegirString("DNI:"));
                    break;
                case 2:
                    personList = loadCsv();
                    personList.sort(nc);
                    printList(personList);
                    break;
                case 3:
                    personList = loadCsv();
                    personList.sort(nc);
                    printList(reverseList(personList));
                    break;
                case 4:
                    personList = loadCsv();
                    personList.sort(sc);
                    printList(personList);
                    break;
                case 5:
                    personList = loadCsv();
                    personList.sort(sc);
                    printList(reverseList(personList));
                    break;
                case 6:
                    personList = loadCsv();
                    personList.sort(dc);
                    printList(personList);
                    break;
                case 7:
                    personList = loadCsv();
                    personList.sort(dc);
                    printList(reverseList(personList));
                    break;
                default:
                    System.out.println("Instrucció no reconeguda.");
            }
            System.out.println();
            input = mainMenu();
        }
        System.out.println("Tancant applicació.");
    }

    static int mainMenu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.- Introduir persona.");
        System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
        System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
        System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
        System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
        System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
        System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
        System.out.println("0.- Sortir.");

        return Entrada.llegirByte("Introdueixi el nombre corresponent a l'acció a realitzar:");
    }
    static ArrayList<Person> loadCsv() {
        ArrayList<Person> personList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\n3exercici1\\resources\\LlistatPersones.csv"))) {
            String line;
            int lineCounter = 1;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    personList.add(new Person(values[0], values[1], values[2]));
                } else {
                    System.err.println("Could not read line " + lineCounter);
                }
                lineCounter++;
            }
        } catch (IOException e) {
            System.err.println("Could not find file.");
            e.printStackTrace();
        }
        return personList;
    }
    static void printToCsv(String line) {
        try {
            File csvFile = new File("src\\n3exercici1\\resources\\LlistatPersones.csv");
            if (csvFile.createNewFile() || csvFile.exists()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("src\\n3exercici1\\resources\\LlistatPersones.csv", true));
                writer.newLine();
                writer.write(line);
                writer.close();
            } else {
                System.out.println("Could not create file.");
            }
        } catch (IOException e) {
            System.err.println("Could not create file.");
            e.printStackTrace();
        }
    }
    static ArrayList<Person> reverseList(ArrayList<Person> list) {
        ArrayList<Person> reverseList = new ArrayList<>();
        ListIterator<Person> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            reverseList.add(it.previous());
        }
        return reverseList;
    }
    static void printList(ArrayList<Person> list) {
        System.out.println(String.format("%-20s", "NOM") + String.format("%-25s", "COGNOMS") + "DNI");
        for (Person p: list) {
            System.out.println(p);
        }
    }
}
