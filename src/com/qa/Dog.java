package com.qa;

public class Dog {
    private String name;
    private int age;
    private String size;
    private String ownerName;

    public void bark() {
        System.out.println("Uff Uff");
    }
    public Dog(String name, int age, String size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
