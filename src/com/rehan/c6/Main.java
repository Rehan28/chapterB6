package com.rehan.c6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher1 = new Teacher("Rehan","01796294755","Patuakhali");
        System.out.println("Teacher 1 information");


        teacher1.getInformation();

        System.out.println("Teacher 2 information");
        Teacher teacher2 = new Teacher("Remon","017983747646","Dumki");
        teacher2.getInformation();
        //Student marks

        Student student1 = new Student("Rehan",new Double[]{44.66,55.55,88.00});
        double totalmarks = student1.total();
        double ava = student1.ava();
        System.out.println("Total Marks Is : "+totalmarks);
        System.out.println("Average Is : "+ava);
    }
}
