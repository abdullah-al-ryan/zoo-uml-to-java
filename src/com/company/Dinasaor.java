package com.company;

public class Dinasaor implements Habits {
    public int age;
    public String size;

    public Dinasaor(int age, String size)
    {
        this.age = age;
        this.size = size;
    }
    public void running()
    {
        System.out.println("It runs so fast!");
    }
    public void eating()
    {
        System.out.println("It eats so much.");
    }
    public void display()
    {
        System.out.println("The age is "+age+" and the size is "+size);
    }


}
