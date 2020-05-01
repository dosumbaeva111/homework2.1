package com.company;

final public class BlackWidow extends FemaleSuperHeroes {
    private int weight;
    private int height;


    public BlackWidow(SuperAbility superAbility, String name, int age, String movie_Name, int year_of_issue, int weight, int height) {
        super(superAbility, name, age, movie_Name, year_of_issue);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void getInfo(){
        System.out.println(" Вес = " + getWeight()+ " Рост  " + getHeight());
        super.getInfo();
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
