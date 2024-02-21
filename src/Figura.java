public class Figura {
    private String codi;
    private double preu;
    private Dimensió dimensio;
    private Superheroi superheroi;

    public Figura(String codi, double preu, Dimensió dimensio, Superheroi superheroi) {
        this.codi = codi;
        this.preu = preu;
        this.dimensio = dimensio;
        this.superheroi = superheroi;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public Dimensió getDimensio() {
        return dimensio;
    }

    public void setDimensio(Dimensió dimensio) {
        this.dimensio = dimensio;
    }

    public Superheroi getSuperheroi() {
        return superheroi;
    }

    public void setSuperheroi(Superheroi superheroi) {
        this.superheroi = superheroi;
    }
    public void pujarPreu(double pujada) {
        preu += pujada;
    }
    @Override
    public String toString() {
        return "Figura{" +
                "codi='" + codi + '\'' +
                ", preu= " + preu +
                ", dimensio= " + dimensio +
                ", superheroi= " + superheroi +
                '}';
    }

}
