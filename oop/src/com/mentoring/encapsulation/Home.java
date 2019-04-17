package com.mentoring.encapsulation;

public class Home {

    private String name;
    private String address;
    private Double surface;

    public Home(String name, String address, Double surface) {
        this.name = name;
        this.address = address;
        this.surface = surface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", surface=" + surface +
                '}';
    }
}
