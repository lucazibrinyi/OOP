package com.codecool.farm.animal;

public abstract class Animal {
    private int size = 0;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Animal() {
    }

    public abstract void feed();
}
