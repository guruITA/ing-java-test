package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

public class Elephant extends Animal implements Herbivore, TrickPerformer {

    public Elephant(String name) {
        super(name, "toeoeoeoet");
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch crunch");
    }

    @Override
    public void performTrick() {
        System.out.println("sprays water with its trunk");
    }
}
