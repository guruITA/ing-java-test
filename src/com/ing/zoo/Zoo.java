package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class Zoo {

    private static final String HELLO = "hello";
    private static final String GIVE_LEAVES = "give leaves";
    private static final String GIVE_MEAT = "give meat";
    private static final String PERFORM_TRICK = "perform trick";

    private static void sayHello(List<Animal> animals, String name) {
        if (name != null) {
            boolean found = false;
            for (Animal animal : animals) {
                if (animal.getName().equals(name)) {
                    animal.sayHello();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("name: " + name + " doesn't exist");
            }
        } else {
            for (Animal animal : animals) {
                animal.sayHello();
            }
        }
    }

    private static void giveLeaves(List<Animal> animals, String name) {
        if (name != null) {
            boolean found = false;
            for (Animal animal : animals) {
                if (animal.getName().equals(name)) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    } else {
                        System.out.println(animal.getName() + " is not a herbivore");
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("name: " + name + " doesn't exist");
            }
        } else {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                } else {
                    System.out.println(animal.getName() + " is not a herbivore");
                }
            }
        }
    }

    public static void main(String[] args) {

        Lion simba = new Lion("simba");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");

        List<Animal> animals = new ArrayList<>();
        animals.add(simba);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().trim();

        switch (input) {
            case HELLO:
                sayHello(animals, null);
                break;
            case GIVE_LEAVES:
                giveLeaves(animals, null);
                break;
            case GIVE_MEAT:
                break;
            case PERFORM_TRICK:
                break;
            default:
                if (input.startsWith(HELLO + " ")) {
                    String name = input.substring(HELLO.length() + 1);
                    sayHello(animals, name);
                } else if (input.startsWith(GIVE_LEAVES + " ")) {
                    String name = input.substring(GIVE_LEAVES.length() + 1);
                    giveLeaves(animals, name);
                } else {
                    System.out.println("Unknown command: " + input);
                }
        }
    }
}
