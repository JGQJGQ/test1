package com.tplink.question1;

public abstract class Role {
    private String name;
    private Gender gender;

    public Role(String name, Gender gender) {
        if (name == null || name.length() > 64 || name.startsWith(" ") || name.endsWith(" ")){
            throw new IllegalArgumentException("Invalid role name");
        }

        this.name = name;
        this.gender = gender;

        // test
        // xiugai
    }


    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
    public abstract void work();
}
