package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

public class Wolf extends Animal implements Carnivore {

    public Wolf(String name) {
        super(name, "auuuuuuu");
    }

    @Override
    public void eatMeat() {
        System.out.println("grrr nom nom");
    }
}
