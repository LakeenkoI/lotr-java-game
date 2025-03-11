package com.lakeenkoi.lordOfTheRings.heroes;

public enum Race {
    HUMAN("Человек", 100, 10),
    ELF("Эльф", 80, 12),
    ORC("Орк", 150, 5);

    String displayName;
    double health;
    double damage;

    Race(String displayName, double health, double damage) {
        this.displayName = displayName;
        this.health = health;
        this.damage = damage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }
}
