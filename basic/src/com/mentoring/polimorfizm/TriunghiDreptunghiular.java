package com.mentoring.polimorfizm;

public class TriunghiDreptunghiular extends Figura {

    private Double cateta1;
    private Double cateta2;

    public TriunghiDreptunghiular(Double cateta1, Double cateta2) {
        super("TRIUNGHI DREPTUNGHIULAR");
        this.cateta1 = cateta1;
        this.cateta2 = cateta2;
    }

    public Double getCateta1() {
        return cateta1;
    }

    public void setCateta1(Double cateta1) {
        this.cateta1 = cateta1;
    }

    public Double getCateta2() {
        return cateta2;
    }

    public void setCateta2(Double cateta2) {
        this.cateta2 = cateta2;
    }

    @Override
    public Double area() {
        return (cateta1 * cateta2) / 2;
    }

    @Override
    public Double perimetru() {
        return cateta1 + cateta2 + (Math.sqrt(cateta1* cateta1 + cateta2 * cateta2));
    }

    @Override
    public String toString() {
        return "TriunghiDreptunghiular{" +
                "cateta1=" + cateta1 +
                ", cateta2=" + cateta2 +
                '}';
    }
}
