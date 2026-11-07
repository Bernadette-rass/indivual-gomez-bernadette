package com.joysistvi.day15.oopintro;

public class main {
    public static void main(String[] args) {
        //Class Instantiation / Create an object of a class
        umbrella umbrella = new umbrella();
        umbrella.brand = "Knirps";
        umbrella.type = "Compact Folding";
        umbrella.Color = "black";
        umbrella.weightinG = 180;
        umbrella.bones = 6;

        umbrella.blockingSunlight();
        umbrella.rainProtection();
        umbrella.shieldFromHeat();


        umbrella umbrella2 = new umbrella();
        umbrella2.brand = "Fulton";
        umbrella2.type = "Parasol";
        umbrella2.Color = "Black/green";
        umbrella2.weightinG = 950;
        umbrella2.bones = 8;

        umbrella2.blockingSunlight();
        umbrella2.rainProtection();
        umbrella2.shieldFromHeat();


        umbrella umbrella3 = new umbrella();
        umbrella3.brand = "Fibrella";
        umbrella3.type = "Compact Folding";
        umbrella3.Color = "Maroon";
        umbrella3.weightinG = 271;
        umbrella3.bones = 6;

        umbrella3.blockingSunlight();
        umbrella3.rainProtection();
        umbrella3.shieldFromHeat();

    }
}
