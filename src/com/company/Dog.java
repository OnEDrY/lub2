package com.company;

public abstract class Dog {
    private String colour;

    protected Dog(String colour) {
        this.colour = colour;
    }

    public Dog()
    {

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
