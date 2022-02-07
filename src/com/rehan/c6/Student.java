package com.rehan.c6;

public class Student {
    private final String name;
    private final Double[] marks;

    public Student(String name,Double[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public double ava(){
          return total()/ marks.length;
    }
    public double total(){
        double total = 0.0;
        for (double mark : marks){
            total = total + mark;
        }
        return total;
    }
}
