package com.lakeenkoi.lordOfTheRings.heroes;

import com.lakeenkoi.lordOfTheRings.weapons.Weapon;

public abstract class Hero {

    protected String name;
    protected double health;
    protected double damage;
    protected double totalDamage;
    protected Race race;
    protected Weapon weapon;

    public Hero(double health, double damage, Race race) {
        this.health = health;
        this.damage = damage;
        this.race = race;
    }

    public abstract void attack(Hero hero);

    public void takeDamage(double damage) {
        health -= damage;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    };

    public double getTotalDamage() {
        return totalDamage;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public double getHealth() {
        return health <= 0
                ? 0
                : health;
    }
}
