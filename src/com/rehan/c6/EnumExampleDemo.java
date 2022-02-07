package com.rehan.c6;

public class EnumExampleDemo {
    public void displayDay(Day day) {
        switch (day) {
            case Friday:
                System.out.println("Its Friday! Weekend");
                break;
            case Monday:
                System.out.println("Its Weekday!");
                break;
            case Saturday:
                System.out.println("Its saturday! Weekend");
                break;
            default:
                System.out.println("Rehan is a Good boy");
        }
    }

    public enum Day {
        Saturday, Sunday, Monday, Tuesday, Wednesday,
        Thursday, Friday
        //This is Day Enum
    }

    public static void main(String[] args) {
        EnumExample rehan = new EnumExample();
        EnumExample.Day day = EnumExample.Day.Friday;
        rehan.displayDay(day);
        //Use of values --sob gula Show kore
        Day[] value = Day.values();
        for (Day i : value) {
            System.out.println("Day : " + i);
        }
    }
}
    //Field method ar connstractor use kora jy

