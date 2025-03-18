package org.example;

public class App {
    public static void main(String[] args) {
        Mentor gandalf = new Mentor("Gandalf", "The Grey");
        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring Bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");

        Quest ringQuest = new Quest("Destroy the One Ring", "Hard");
        gandalf.overseeQuest(ringQuest);

        frodo.joinQuest(ringQuest);
        aragorn.joinQuest(ringQuest);
    }
}
