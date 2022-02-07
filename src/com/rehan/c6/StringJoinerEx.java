package com.rehan.c6;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        String[] citys = {"Patuakhali","Dhaka","Barisal","Rajsahi"};
        StringJoiner Rehan = new StringJoiner(" , ","{ "," }");
        for(String i : citys){
            Rehan.add(i);
        }
        System.out.println("Citys of bangladesh : "+Rehan);
    }

}
