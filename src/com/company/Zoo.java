package com.company;

public class Zoo {
    public String zName;
    public String location;
    private Dinasaor di;

    Zoo(String zName, String location, Dinasaor di)
    {
        System.out.println("Now we are in: "+location);
        System.out.println("Welcome to: "+zName);
        System.out.println("DIU students will encounter a Dinasaor now!!! ");
        di.running();
        di.eating();
        di.display();

    }

    public static void main(String[] args)
    {
        Dinasaor d = new Dinasaor(50,"Large");
        Zoo z = new Zoo("ChiriyaKhana","Mirpur-1",d);

    }
}
