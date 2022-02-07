package com.rehan.c6;

public class EnumExample {
    public void displayDay(Day day){
        if(day == Day.Saturday){
            System.out.println("It is Saturday! Weekend");
        }
        else if(day == Day.Friday){
            System.out.println("It is Friday! Weekend");
        }
        else {
            System.out.println("Weekday!");
        }
    }
    public enum Day{
        Saturday,Sunday,Monday,Tuesday,Wednesday,
        Thursday,Friday
        //This is Day Enum
    }
    public static void main(String[] args) {
        EnumExample rehan = new EnumExample();
        EnumExample.Day day = EnumExample.Day.Friday;
        rehan.displayDay(day);
    }

}
