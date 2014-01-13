package org.kiwi.refactoring.replace.inheritance.with.delegation;

public class Manager extends People {
    public Manager(String name) {
        super(name);
    }

    public String display() {
        return "I am manager: " + name;
    }
}
