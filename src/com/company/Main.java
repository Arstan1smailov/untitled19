package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Father father = new Father(44, "Carl", 180, 8000);
        Son son = new Son(18,"John",182, 2000);
        Son son2 = new Son(20,"Cane",184, 3000);
        System.out.println(son.getInfo());
        System.out.println(son2.getInfo());
        System.out.println(father.getInfo());
        System.out.println(father.Father(80));

    }
}
