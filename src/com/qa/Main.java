package com.qa;

import java.nio.charset.CoderResult;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle ("rectangle1", "yellow", 0, 0, 10, 10);
        Rectangle r2 = new Rectangle ("rectangle2", "green", 2, 2, 5, 2);
        System.out.println(r);
        System.out.println(r2);

        System.out.println(r + ", CentrePoint is: "
                + r.getCenterPoint() + ", Area is: " + r.getArea()
                + ". Is it square? " + r.isSquare());
        System.out.println(r2 + ", CentrePoint is: "
                + r2.getCenterPoint() + ", Area is: " + r2.getArea()
                + ". Is it square? " + r2.isSquare());

        Circle c1 = new Circle("circle1", "red", 0, 0, 10);
        Circle c2 = new Circle("circle2", "blue", 10, 10, 5);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1 + ", CentrePoint is: " +
                c1.getCenterPoint() + ", Area is: " + c1.getArea());
        System.out.println(c2 + ", CentrePoint is: " +
                c2.getCenterPoint() + ", Area is: " + c2.getArea());

        System.out.println("Circle location before move: " + c1.getCurrentLocation());
        c1.move(13.2, 2.5);
        System.out.println("Circle location after move: " + c1.getCurrentLocation());
    }
}
