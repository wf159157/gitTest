package service;

import java.io.Serializable;

public class Dog implements Serializable {
    private String Name;
    private Integer age;

    public Dog(String name, Integer age) {
        Name = name;
        this.age = age;
    }
}
