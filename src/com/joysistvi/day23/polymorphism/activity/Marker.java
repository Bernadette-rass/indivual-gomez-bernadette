package com.joysistvi.day23.polymorphism.activity;

public class Marker extends Pen{
    private boolean permanent;

    public Marker(String type, String brand, String color, double weightInGrams, double point, boolean permanent) {
        super(type, brand, color, weightInGrams, point);
        this.permanent = permanent;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public void write() {
        System.out.println(getBrand() + " Writing boldly with a marker.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the marker ink.");
    }

    @Override
    public String toString() {
        return super.toString() + "Permanent: " + (permanent ? "Yes" : "No") + '\n';
    }
}
