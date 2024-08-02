package com.tplink.question1;

public class Employee extends Role implements Praise {
    private String id;
    private int praiseCount;

    public Employee(String name, Gender gender, String id) {
        super(name, gender);
        this.id = id;

    }

    public int getPraisedCount() {
        return praiseCount;
    }

    public String getId() {
        return id;
    }
    public void increasePraiseCount() {
        this.praiseCount++;
    }
    public void work(){
        System.out.println("I am coding.");
    }

    public void praise(Employee employee) {
        employee.increasePraiseCount();
    }
}
