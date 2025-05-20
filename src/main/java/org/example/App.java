package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        frodo.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor");

        Quest quest = new Quest();
        quest.completeQuest(100);
    }
}
