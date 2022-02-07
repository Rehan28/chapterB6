package com.rehan.c6;

public class Teacher {
    String name,phnNUmber,add;
    void getInformation(){

        System.out.println("Name : "+name);
        System.out.println("Phone Number : "+phnNUmber);
        System.out.println("Adderes : "+add);
        System.out.println("\n");
    }
    //constrctor
    Teacher(String n,String ph,String ad){
        name = n;
        phnNUmber = ph;
        add = ad;

    }
}

