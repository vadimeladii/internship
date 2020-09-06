package com.mentoring.polimorfizm;

public class Dreptunghi extends Figura {

    private Double lungime;
    private Double latime;

    public Dreptunghi(Double lungime, Double latime) {
        super("DREPTUNGHI");
        this.lungime = lungime;
        this.latime = latime;
    }

    public Double getLungime() {
        return lungime;
    }

    public void setLungime(Double lungime) {
        this.lungime = lungime;
    }

    public Double getLatime() {
        return latime;
    }

    public void setLatime(Double latime) {
        this.latime = latime;
    }

    @Override
    public Double area() {
        return lungime * latime;
    }

    @Override
    public Double perimetru() {
        return 2 * (lungime + latime);
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }
}
