package org.example;

public class App {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Arthur", 5);
        Hero hero2 = new Hero("Lancelot", 7);
        Enemy orc = new Enemy("Orc", 4);
        Enemy troll = new Enemy("Troll", 6);

        hero1.speak();
        hero2.speak();
        orc.speak();
        troll.speak();

        BattleManager battleManager = new BattleManager();
        battleManager.battle(hero1, orc);
        battleManager.battle(hero2, troll);
    }
}