package n2exercici1;

public class Restaurant {
    private String nom;
    private int puntuacio;

    public Restaurant (String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }
    public int getPuntuacio() {
        return puntuacio;
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
