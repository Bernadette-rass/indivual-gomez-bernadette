package com.joysistvi.day22.inheritance.Activity;

public class Pen {
    private String type;
    private String brand;
    private String color;
    private double weightInGrams;
    private double point;

    public Pen(String type, String brand, String color, double weightInGrams, double point){
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
        this.point = point;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams){
        this.weightInGrams = weightInGrams;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point){
        this.point = point;
    }

    public void write() {
        System.out.println("Writing with a pen.");
    }

    @Override
    public String toString(){
        return "Type: " + type + '\n' +
                "Brand: " + brand + '\n' +
                "Color: " + color + '\n' +
                "Weight in Grams: " + weightInGrams + '\n' +
                "Point Size: " + point + '\n';
    }

}
