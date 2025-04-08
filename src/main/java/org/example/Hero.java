package org.example;

class Hero extends Character {
    public Hero(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: I will protect Eldoria!");
    }
}