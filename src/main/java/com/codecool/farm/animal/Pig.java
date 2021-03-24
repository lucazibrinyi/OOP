package com.codecool.farm.animal;

public class Pig extends Animal {
    private String name = "pig";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void feed() {
        super.setSize(super.getSize() + 1);
    }
}
