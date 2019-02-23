package com.dimaivashchenko;

public class Main {

    public static void main(String[] args) {
        Person alex = new Person("Alex", 20);
        Group group1 = new Group("Group1");
        group1.add(alex);
        System.out.println(group1);

        Group group2 = new Group("test");
        group2.add(alex);
        System.out.println(alex);
        group2.remove(alex);
        System.out.println(alex);
    }
}
