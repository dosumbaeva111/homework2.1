package com.company;

public class Main {

    public static void main(String[] args) {
        FemaleSuperHeroes objectA = new FemaleSuperHeroes(SuperAbility.SPEED, " Wanda ", 25, " Avengers Infinity war  ", 2019);
        BlackWidow objectB = new BlackWidow(SuperAbility.POWER, " Lucia ", 35, " Iron man ", 2011, 46, 170);
        BlackWidow objectC = new BlackWidow(SuperAbility.FLY, " Marry ", 18, " Hulk ", 2000, 70, 190);
        objectA.getInfo();
        objectB.getInfo();
        objectC.getInfo();



    }
}
