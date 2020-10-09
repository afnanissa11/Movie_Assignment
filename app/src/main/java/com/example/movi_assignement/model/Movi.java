package com.example.movi_assignement.model;

public class Movi {
    private String name;
    private int year;
    private String category;

    //constructor


    public Movi(String name, int year, String category) {
        this.name = name;
        this.year = year;
        this.category = category;
    }



    //set&get


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
