package com.codecool.farm.animal;

public class Cattle extends Animal {
    private String name = "cattle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void feed() {
        super.setSize(super.getSize() + 2);
    }
}
