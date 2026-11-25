package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[]{
                "hello",
                "give leaves",
                "give meat",
                "perform trick"
        };

        Lion simba = new Lion("simba");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if (input.equals(commands[0] + " simba")) {
            simba.sayHello();
            simba.eatMeat();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
