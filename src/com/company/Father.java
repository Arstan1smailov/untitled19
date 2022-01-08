package com.company;

public class Father extends GrandFather{
    public Father(int age, String name, int tall, int salary) {
        super(age, name, tall);
        this.salary = salary;
    }
    public int Father(int Weight) {
        this.Weight = Weight;
        return Weight;
    }
    private int salary;
    private int Weight;

    public int getSalary() {
        return salary;
    }
    public String getInfo(){
return super.getInfo() + "\nSalary: " + salary;
    }
}
