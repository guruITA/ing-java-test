package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {
    public String eatText;
    public String trick;

    public Pig(String name)
    {
        super(name, "splash");
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        say(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        say(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        say(trick);
    }
}
