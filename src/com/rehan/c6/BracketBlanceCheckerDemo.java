package com.rehan.c6;

public class BracketBlanceCheckerDemo {
    public static void main(String[] args) {
        String[] bracket = {
                "()",
                "()))",
                "((()",
                "((()))",
                "((())))"
        };
        BracketBlanceChecker Checker = new BracketBlanceChecker();
        for (String brackets : bracket) {
            if (Checker.isBalanced(brackets)) {
                System.out.println(brackets + " is balanced");
            } else {
                System.out.println(brackets + " is not balanced");
            }
        }
    }
}
