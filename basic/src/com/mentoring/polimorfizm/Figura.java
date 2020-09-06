package com.mentoring.polimorfizm;

public abstract class Figura {

    private String type;

    public Figura(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract public Double area();

    abstract public Double perimetru();

    @Override
    public String toString() {
        return "Figura{" +
                "type='" + type + '\'' +
                '}';
    }
}
