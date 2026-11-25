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

        switch (input) {
            case "hello":
                for (Animal animal : animals) {
                    animal.sayHello();
                }
                break;
            default:
                System.out.println("Unknown command: " + input);
        }
    }
}
