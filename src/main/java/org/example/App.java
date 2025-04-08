package org.example;

public class App {
    public static void main(String[] args) {
        Hero mage = new Mage("Gandalf", 10);
        Hero warrior = new Warrior("Aragorn", 8);
        Enemy orc = new Enemy("Orc", 7);
        Enemy troll = new Enemy("Troll", 9);

        mage.speak();
        warrior.speak();
        orc.speak();
        troll.speak();

        QuestBoard board = new QuestBoard();
        board.assignQuest((Mage) mage, "Defeat the Dark Lord");
        board.assignQuest((Warrior) warrior, "Guard the Fortress");

        BattleManager battleManager = new BattleManager();
        battleManager.battle((Mage) mage, orc);
        battleManager.battle((Warrior) warrior, troll);
    }
}