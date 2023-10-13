package n2exercici2;

public class Restaurant implements Comparable<Restaurant>{
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }
    public int getPuntuacio() {
        return puntuacio;
    }

    public int compareTo(Restaurant r) {
        int returnValue = nom.compareTo(r.getNom());
        if (returnValue == 0) {
            returnValue = Integer.compare(r.getPuntuacio() , puntuacio);
        }
        return returnValue;
    }

    @Override
    public boolean equals(Object r) {
        boolean isEqual = false;
        if (r instanceof Restaurant) {
            isEqual = nom.equals(((Restaurant) r).getNom()) && puntuacio == ((Restaurant) r).getPuntuacio();
        }
        return isEqual;
    }
    @Override
    public int hashCode() {
        return nom.hashCode() * puntuacio;
    }

    @Override
    public String toString() {
        return "nom = " + nom + "; puntuacio = " + puntuacio + ";";
    }
}
