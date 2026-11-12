package com.joysistvi.day24.activity;

public class Ballpen extends Pen implements Refillable, Clickable{

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

    @Override
    public void write(){
        System.out.println(getBrand() + " Writing smoothly with a ballpen.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    // NEW: uses the CLICK_SOUND constant from Clickable
    @Override
    public void click() {
        System.out.println(CLICK_SOUND + " The ballpen tip comes out.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
