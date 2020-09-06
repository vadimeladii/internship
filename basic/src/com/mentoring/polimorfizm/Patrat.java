package com.mentoring.polimorfizm;

public class Patrat extends Figura {

    private Double latura;

    public Patrat(Double latura) {
        super("PATRAT");
        this.latura = latura;
    }

    public Double getLatura() {
        return latura;
    }

    public void setLatura(Double latura) {
        this.latura = latura;
    }

    @Override
    public Double area() {
        return latura * latura;
    }

    @Override
    public Double perimetru() {
        return 4 * latura;
    }

    @Override
    public String toString() {
        return "Patrat{" +
                "latura=" + latura +
                '}';
    }
}
