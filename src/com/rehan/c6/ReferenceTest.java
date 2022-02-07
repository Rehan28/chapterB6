package com.rehan.c6;

import java.awt.*;

public class ReferenceTest {
    public static void main(String[] args) {
        Point a;
        Point b;
        a = new Point(100,100);
        b = a;
         b.x = 200;
         b.y = 300;
        System.out.println("a : "+a.x+","+a.y);
        System.out.println("a : "+b.x+","+b.y);
        // Same output--
    }
}
