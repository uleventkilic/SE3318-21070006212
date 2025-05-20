package org.example;

/**
 * Represents a character from the Lord of the Rings universe.
 * Each character has basic attributes like name, race, and age.
 */
public class Character {
    /** The name of the character. */
    private final String name;
    
    /** The race of the character (e.g., Hobbit, Elf, Dwarf). */
    private final String race;
    
    /** The age of the character in years. */
    private final int age;

    /**
     * Constructs a new Character with the specified attributes.
     *
     * @param name The name of the character
     * @param race The race of the character
     * @param age The age of the character
     */
    public Character(final String name, final String race, final int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Prints the character's details based on their attributes.
     */
    public void printDetails() {
        if (race.equals("Hobbit")) {
            System.out.println("Character is a Hobbit");
        }

        if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if (name.equals("Frodo")) {
            System.out.println("Character is Frodo");
        }
    }

    /**
     * Gets the character's name.
     *
     * @return The character's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the character's race.
     *
     * @return The character's race
     */
    public String getRace() {
        return race;
    }

    /**
     * Gets the character's age.
     *
     * @return The character's age
     */
    public int getAge() {
        return age;
    }
}