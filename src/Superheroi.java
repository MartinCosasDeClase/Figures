public class Superheroi {
    private String nom;
    private String descripcio;
    private boolean capa;

    public Superheroi(String nom) {
        this.nom = nom;
        this.descripcio ="";
        this.capa = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Superheroi{" +
                "nom='" + nom + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", capa=" + capa +
                '}';
    }
}
