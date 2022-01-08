package com.company;

import java.util.Random;

public final class Son extends Father{

    public Son(int age, String name, int tall, int salary) {

        super(age, name, tall, salary);
        Random random = new Random();
        this.Friends = random.nextInt(7 + 3);
    }
    private int Friends;
    public void numOfFriends(){
        Random random = new Random();
        int a = random.nextInt(7 + 3);
        int Friends = random.nextInt(7 + 3);
    }
    public String getInfo(){
        return super.getInfo() + "\nFriends: " + Friends;
    }
}
