package com.rehan.c6;

import java.util.Scanner;

public class X31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        long x = input.nextLong();
        int count=0;
        while (x!=1){
            if(x%2==0){
                x = x/2;
            }
            else {
                x = (x*3)+1;
            }
            System.out.println("Number : "+x);
            count++;
        }
        System.out.println("Total : "+count);
    }
}
