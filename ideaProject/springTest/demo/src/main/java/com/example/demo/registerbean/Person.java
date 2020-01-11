package com.example.demo.registerbean;

public class Person {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public String speak(){
        return "我叫"+name;
    }
}
