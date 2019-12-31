package com.huifer.source.spring.bean;

public class Person {
    private String name;
    private Apple apple;

    public void dis() {
        System.out.println("dis");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
