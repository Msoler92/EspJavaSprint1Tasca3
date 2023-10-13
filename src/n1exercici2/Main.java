package n1exercici2;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main (String[] args) {
        System.out.println("Primera llista:");
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i + 1);
            System.out.print(i+1 + " ");
        }
        System.out.println();

        System.out.println("Segona llista:");
        ArrayList<Integer> secondList = new ArrayList<>();
        ListIterator<Integer> it = integerList.listIterator(integerList.size());
        while (it.hasPrevious()) {
            secondList.add(it.previous());
        }

        //Mostrem la llista per pantalla
        for (Integer n: secondList) {
            System.out.print(n + " ");
        }
        System.out.println();


    }
}
