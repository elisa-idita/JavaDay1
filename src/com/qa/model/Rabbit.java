package com.qa.model;

public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Snufle snufle";
    }

    @Override
    public String move() {
        return "Hop hop";
    }

    @Override
    public String toString() {
        return "Rabbit " + super.toString();
    }
}
