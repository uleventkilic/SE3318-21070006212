package org.example;

class Enemy extends Character {
    public Enemy(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Eldoria will fall!");
    }
}
