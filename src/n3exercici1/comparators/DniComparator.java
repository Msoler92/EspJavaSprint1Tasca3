package n3exercici1.comparators;

import n3exercici1.Person;

import java.util.Comparator;

public class DniComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getDni().compareTo(person2.getDni());
    }
}
