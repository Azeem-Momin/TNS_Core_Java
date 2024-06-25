package com.geography.continent;



public class Continent {
    private String name;
    private double area; // in square kilometers

    public Continent(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void displayInfo() {
        System.out.println("Continent: " + name);
        System.out.println("Area: " + area + " sq km");
    }
}