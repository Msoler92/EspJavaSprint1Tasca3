package n3exercici1.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    static Scanner sc = new Scanner(System.in);
    public static byte llegirByte(String message) {
        byte input = 0;
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.nextByte();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
    public static int llegirInt(String message) {
        int input = 0;
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.nextInt();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
    public static float llegirFloat(String message) {
        float input = 0;
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.nextFloat();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
    public static double llegirDouble(String message) {
        double input = 0;
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.nextDouble();
                acceptedInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }

    public static char llegirChar(String message) {
        char input = 'a';
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.next().charAt(0);
                acceptedInput = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
    public static String llegirString(String message) {
        String input = "";
        boolean acceptedInput = false;
        do {
            System.out.println(message);
            try {
                input = sc.next();
                acceptedInput = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (!acceptedInput);
        return input;
    }
    public static boolean llegirSiNo(String message) {
        char input = 'a';
        boolean acceptedInput = false;
        boolean returnValue = false;

        do {
            System.out.println(message);
            try {
                input = sc.next().toLowerCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
            if (input == 's') {
                returnValue = true;
                acceptedInput = true;
            } else if (input == 'n'){
                returnValue = false;
                acceptedInput = true;
            } else {
                System.out.println("Error");
            }
        } while (!acceptedInput);
        return returnValue;
    }
}
