package com.mentoring.polimorfizm;

public class Cerc extends Figura {

    private Double raza;
    private final Double PI = 3.14;

    public Cerc(Double raza) {
        super("CERC");
        this.raza = raza;
    }

    public Double getRaza() {
        return raza;
    }

    public void setRaza(Double raza) {
        this.raza = raza;
    }

    @Override
    public Double area() {
        return PI * raza * raza;
    }

    @Override
    public Double perimetru() {
        return 2 * PI * raza;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                '}';
    }
}
