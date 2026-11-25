package com.ing.zoo;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[]{
                "give leaves",
                "give meat",
                "perform trick"
        };

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
            case "hello":
                if (name != null) {
                    for (Animal animal : animals) {
                        if (animal.getName().equals(name)) {
                            animal.sayHello();
                            break;
                        }
                    }
                } else {
                    for (Animal animal : animals) {
                        animal.sayHello();
                    }
                }
                break;
            default:
                System.out.println("Unknown command: " + input);
        }
    }
}
