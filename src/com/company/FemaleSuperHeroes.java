package com.company;

public class FemaleSuperHeroes extends MarvelSuperHeroes {
    private String movie_Name;
    private int year_of_issue;

    public FemaleSuperHeroes(SuperAbility superAbility, String name, int age, String movie_Name, int year_of_issue) {
        super(superAbility, name, age);
        this.movie_Name = movie_Name;
        this.year_of_issue = year_of_issue;
    }

    public String getMovie_Name() {
        return movie_Name;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void getInfo() {
        System.out.println(" Название фильма " + getMovie_Name() + " Год выпуска " + getYear_of_issue() + " Имя " + getName() + " Суперспособность " + getSuperAbility() + " Возраст " + getAge());
    }

    public void trailer(String movie_Name, int year_of_issue) {
        System.out.println("Название фильма " + movie_Name + "Год выпуска " + year_of_issue);
    }

    public final void trailer(int year_of_issue) {
        System.out.println("Название фильма " + movie_Name + "Год выпуска " + year_of_issue);
    }

    public final void getInfo(int year_of_issue) {
        System.out.println(" Год выпуска " + year_of_issue);
    }
}


