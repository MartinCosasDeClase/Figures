import java.util.ArrayList;

public class Coleccio {
    private String nomColeccio;
    private ArrayList<Figura> llistaFigures;

    public Coleccio(String nomColeccio, ArrayList<Figura> llistaFigures) {
        this.nomColeccio = nomColeccio;
        this.llistaFigures = llistaFigures;
    }

    public String getNomColeccio() {
        return nomColeccio;
    }

    public void setNomColeccio(String nomColeccio) {
        this.nomColeccio = nomColeccio;
    }
    public void afegirFigura(Figura figura) {
        llistaFigures.add(figura);
    }
    public void pujarPreuFigura(String codi, double pujada) {
        for (Figura figura : llistaFigures) {
            if (figura.getCodi().equals(codi)) {
                figura.pujarPreu(pujada);
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Figura figura : llistaFigures) {
            sb.append(figura.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    public String ambCapa() {
        String temp = "";
        for (Figura figura : llistaFigures) {
            if (figura.getSuperheroi().isCapa()) {
               temp = figura.getSuperheroi().getNom() + ", ";
            }
        }
        return temp;
    }
    public Figura mesValuos(){
        Figura temp = llistaFigures.get(0);
        for (Figura figura : llistaFigures) {
            if (figura.getPreu() > temp.getPreu()) {
                temp = figura;
            }
        }
        return temp;
    }
    public double getValorColeccio() {
        double valor = 0;
        for (Figura figura : llistaFigures) {
            valor += figura.getPreu();
        }
        return valor;
    }
    public double getVolumeColeccio() {
        double volum = 0;
        for (Figura figura : llistaFigures) {
            volum += figura.getDimensio().getVolumen();
        }
        volum += 200;
        return volum;
    }
}