package com.qa.exception;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc badCalc = new BadCalc();
        System.out.println("Mult result: " + badCalc.mult(2,3));
        try {
            System.out.println("Div result: " + badCalc.div(2,0));
        } catch (ArithmeticException e) {
            System.out.println("Calculator error caught");
        }

    }
}
