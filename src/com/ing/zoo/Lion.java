package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore{
    public String eatText;

    public Lion(String name) {
        super(name, "grrrrrr");
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        say(eatText);
    }
}
