package com.company;

public class Pug extends Dog {
    private int numOfPaw;


    public Pug(int numOfPaw) {
        this.numOfPaw = numOfPaw;
    }

    public Pug() {

    }

    public int getNumOfPaw() {
        return numOfPaw;
    }

    public void setNumOfPaw(int numOfPaw) {
        this.numOfPaw = numOfPaw;
    }

    @Override
    public String toString() {
        return "Pow to Pug";
    }
}

