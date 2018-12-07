package com.company;

//Its not necessary
    public class Dog {

    private String dogName = "Vitya";
    private String dogBark = "Gav-Gav";
    private int dogAge = 4;


    public String getDogName() {
        return dogName;
    }

    public String getDogBark(int barkType) {
        if (barkType == 1) {
            return dogBark;
        }
        else if (barkType == 2) {
            return "Woof-Woof";
        }
        return "...";
    }

    public int getDogAge() {
        return dogAge;
    }
}
