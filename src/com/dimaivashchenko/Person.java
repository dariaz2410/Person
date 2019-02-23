package com.dimaivashchenko;

public class Person {
    private String name;
    private int age;
    private Group group;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        String gruopName = null;
        if (group != null) {
            gruopName = group.getName();
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + gruopName +
                '}';
    }
}
