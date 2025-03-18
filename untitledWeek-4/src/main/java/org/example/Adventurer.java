package org.example;

import java.util.ArrayList;
import java.util.List;

public class Adventurer extends Character implements Joinable {
    private String race;
    private List<Quest> quests;

    public Adventurer(String name, String title, String race) {
        super(name, title);
        this.race = race;
        this.quests = new ArrayList<>();
    }

    public void joinQuest(Quest quest) {
        quests.add(quest);
        quest.addAdventurer(this);
        System.out.println(name + " joined the quest: " + quest.getName());
    }

    public List<Quest> getQuests() {
        return quests;
    }
}
