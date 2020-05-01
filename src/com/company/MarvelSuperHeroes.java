package com.company;

public class MarvelSuperHeroes {
    private SuperAbility superAbility;
    private String name;
    private int age;

    public MarvelSuperHeroes(SuperAbility superAbility, String name, int age) {
        this.superAbility = superAbility;
        this.name = name;
        this.age = age;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
