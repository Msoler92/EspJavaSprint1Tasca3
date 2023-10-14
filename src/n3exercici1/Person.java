package n3exercici1;

public class Person {
    private String name;
    private String surnames;
    private String dni;

    public String getName(){
        return name;
    }
    public String getSurnames() {
        return surnames;
    }
    public String getDni() {
        return dni;
    }
    public Person (String name, String surnames, String dni) {
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("%-20s", name) + String.format("%-25s", surnames) + dni;
    }
}
