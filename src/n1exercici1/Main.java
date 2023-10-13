package n1exercici1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> monthList = new ArrayList<>();
        System.out.println("Inicialitzant llista.");
        monthList.add(new Month("Gener"));
        monthList.add(new Month("Febrer"));
        monthList.add(new Month("Març"));
        monthList.add(new Month("Abril"));
        monthList.add(new Month("Maig"));
        monthList.add(new Month("Juny"));
        monthList.add(new Month("Juliol"));
        monthList.add(new Month("Setembre"));
        monthList.add(new Month("Octubre"));
        monthList.add(new Month("Novembre"));
        monthList.add(new Month("Desembre"));

        for (Month month: monthList) {System.out.print(month.toString() + " ");}
        System.out.println();
        System.out.println("Afegim el mes 'Agost'.");
        monthList.add(7, new Month("Agost"));
        for (Month month: monthList) {System.out.print(month.toString() + " ");}
        System.out.println();

        System.out.println("Eliminem el mes 'Agost'. Transformem l'ArrayList en HashSet.");
        monthList.remove(7);
        HashSet<Month> monthSet = new HashSet<>(monthList);
        for (Month month: monthSet) {System.out.print(month.toString() + " ");}
        System.out.println();

        System.out.println("Afegim el mes Agost quatre vegades.");
        Month duplicateMonth = new Month("Agost");
        monthSet.add(duplicateMonth);
        monthSet.add(duplicateMonth);
        monthSet.add(duplicateMonth);
        monthSet.add(duplicateMonth);
        for (Month month: monthSet) {System.out.print(month.toString() + " ");}
        System.out.println();

        System.out.println("Recorrem la llista amb un for.");
        for (int i = 0; i < monthList.size(); i++) {
            System.out.print(monthList.get(i).toString() + " ");
        }
        System.out.println();
        System.out.println("Recorrem la llista amb un iterador");
        Iterator<Month> it = monthList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().toString() + " ");
        }




    }
}
