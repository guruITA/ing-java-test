package com.ing.zoo;

public abstract class Animal {

    /**
     * name of the animal
     */
    private final String name;

    /**
     * sound of the animal
     */
    private final String sound;

    /**
     * constructor
     */
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    /**
     * the animal says hello
     */
    public void sayHello() {
        System.out.println("hello I am " + name + ": " + sound);
    }

    /**
     * Getter
     * gets the name of the animal because its private and cannot be accessed directly
     * @return name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * only used in classes that extend animal prints the text in console can be any text
     * @param text text that prints in console
     */
    protected void say(String text) {
        System.out.println(name + ": " + text);
    }
}
