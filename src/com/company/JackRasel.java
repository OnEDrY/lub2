package com.company;

public class JackRasel {
    private int numOfSpot;

    public JackRasel(int numOfSpot) {
        this.numOfSpot = numOfSpot;
    }

    public JackRasel() {

    }

    public int getNumOfSpot() {
        return numOfSpot;
    }

    public void setNumOfSpot(int numOfSpot)
    {
        this.numOfSpot = numOfSpot;
    }

    @Override
    public String toString() {
        return "Spot to JackRasel";
    }
}
