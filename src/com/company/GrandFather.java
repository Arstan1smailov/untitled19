package com.company;

public class GrandFather {
    private int age;
    private String name;
    private int tall;

    public GrandFather(int age, String name, int tall) {
        this.age = age;
        this.name = name;
        this.tall = tall;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSkin() {
        return tall;
    }
    public String getInfo(){
        return "Age: " + age + "\nname: " + name + "\ntall: " + tall;
    }
}
