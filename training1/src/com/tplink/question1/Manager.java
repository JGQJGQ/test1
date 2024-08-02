package com.tplink.question1;

public class Manager extends Employee {

    public Manager(String name, Gender gender, String id) {
        super(name, gender, id);
    }

    public void work() {
        System.out.println("I am coding.");
        System.out.println("I am managing.");
    }
}
