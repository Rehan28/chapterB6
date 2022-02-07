package com.rehan.c6;

public class CharStackDemo {
    public static void main(String[] args) {
        ChaeStack stack = new ChaeStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.printElements();
        stack.pop();


        stack.printElements();
    }
}
