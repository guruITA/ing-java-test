package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public String eatText;

    public Hippo(String name) {
        super(name, "splash");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
