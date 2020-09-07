package com.company;

public class Main {

    public static void main(String[] args) {

        Pug p = new Pug();
        JackRasel j = new JackRasel();

        p.setNumOfPaw(4);
        System.out.print(p.getNumOfPaw() + " ");
        System.out.println(p.toString());

        j.setNumOfSpot(25);
        System.out.print(j.getNumOfSpot() + " ");
        System.out.println(j.toString());


    }
}
