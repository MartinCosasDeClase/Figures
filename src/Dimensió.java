public class Dimensió {
    private double alt;
    private double ample;
    private double profunditat;

    public Dimensió() {
        this.alt = 0;
        this.ample = 0;
        this.profunditat = 0;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getAmple() {
        return ample;
    }

    public void setAmple(double ample) {
        this.ample = ample;
    }

    public double getProfunditat() {
        return profunditat;
    }

    public void setProfunditat(double profunditat) {
        this.profunditat = profunditat;
    }
    public double getVolumen() {
        return alt * ample * profunditat;
    }
    public String toString() {
        return "Alt: " + alt + ", Ample: " + ample + ", Profunditat: " + profunditat + ", Volum Màxim: " + getVolumen();
    }
}
