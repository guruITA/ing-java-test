package com.ing.zoo;

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
        String[] parts = input.split(" ");
        String command = parts[0];
        String name = parts.length > 1 ? parts[1] : null;

        switch (command) {
            case HELLO:
                sayHello(animals, name);
                break;
            default:
                System.out.println("Unknown command: " + input);
        }
    }
}
