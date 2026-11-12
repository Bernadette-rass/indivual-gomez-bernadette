package com.joysistvi.day23.polymorphism.activity;

public class Ballpen extends Pen{
    String typee;
    double pointsize;
    public Ballpen(String typee, String brandd, String color, double weightInGrams, double pointsize){
        super(typee, brandd, color, weightInGrams, pointsize);
        this.typee = typee;
        this.pointsize = pointsize;
    }

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee){
        this.typee = typee;
    }

    public double getPointsize() {
        return pointsize;
    }

    public void setPointsize(double pointsize){
        this.pointsize = pointsize;
    }

    // CHANGED: renamed from writing() to write() so it overrides Pen.write()
    @Override
    public void write(){
        System.out.println(getBrand() + " Writing smoothly with a ballpen.");
    }

    // NEW (Part 1)
    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
