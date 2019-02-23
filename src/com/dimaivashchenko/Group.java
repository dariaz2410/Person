package com.dimaivashchenko;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Person> list = new ArrayList<>();

    public void add(Person person) {
        person.setGroup(this);
        list.add(person);
    }

    public String getName() {
        return name;
    }

    public void remove(Person person) {
        person.setGroup(null);
        list.remove(person);
    }

    public void removeName(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                list.remove(person);
                break;
            }
        }
    }

    public int size() {
       return list.size();
    }

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
