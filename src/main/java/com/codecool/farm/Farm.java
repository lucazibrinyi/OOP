package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Farm {
    List<Animal> animals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        if (animals.size() > 0) {
            for (Iterator<Animal> iterator = animals.iterator(); iterator.hasNext(); ) {
                Animal animal = iterator.next();
                if (butcher.canButcher(animal) == true) {
                    iterator.remove();
                }
            }
        }

    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Animal animal : animals) {
            status.add("There is a " + animal.getSize() + " sized " + animal.getName() + " in the farm.");
        }
        return status;
    }
}
