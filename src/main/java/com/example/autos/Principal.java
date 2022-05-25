package com.example.autos;

public class Principal {
    public static void main(String[] args) {
        Auto Bumblebee = new Auto("Chevrolet", "Camaro", 1990);
        Auto Optimus = new Auto("Peterbilt", "379", 1992);
        Auto Ironhide = new Auto("GMC", "Topkick", 1989);
        Auto Ratchet = new Auto("Pontiac", "Pontiac", 1992);
        Auto Jazz = new Auto("Honda", "Jazz", 1990);
        Auto myArray[];
        myArray = new Auto[5];
        myArray[0] = Bumblebee;
        myArray[1] = Optimus;
        myArray[2] = Ironhide;
        myArray[3] = Ratchet;
        myArray[4] = Jazz;

        for (Auto a: myArray) {
            System.out.println(a.toString() + "\n");
        }
    }
}
