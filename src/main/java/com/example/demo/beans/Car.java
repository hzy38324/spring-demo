package com.example.demo.beans;

/**
 * @author: nitzschhong
 * @create: 2022-10-08 20:59
 */
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + this.name);
    }
}
