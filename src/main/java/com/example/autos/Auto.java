package com.example.autos;

public class Auto {
    private String mark;
    private String model;
    private int year;

    public Auto(String mark,String model, int year)
    {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public Auto() {
        mark = "Ferrari";
        model = "GT";
        year = 2000;
    }

    public String toString() {
        return "Auto( " +
                "marca: " + mark + "\n" +
                "modelo: " + model + "\n" +
                "anio: " + year + ')';
    }

}