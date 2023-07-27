package com.qa.model;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Hellooooooooo";
    }

    @Override
    public String move() {
        return "Ruuuuuuuuun";
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
