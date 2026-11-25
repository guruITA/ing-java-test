package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;

import java.util.Random;

public class Zebra extends Animal implements Herbivore {
    public String eatText;

    public Zebra(String name) {
        super(name, "zebra zebra");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
