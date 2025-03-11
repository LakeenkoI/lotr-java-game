package com.lakeenkoi.lordOfTheRings.heroes;

import com.lakeenkoi.lordOfTheRings.utils.RandomAttack;

public class Orc extends Hero {

    public Orc(double health, double damage, Race race) {
        super(health, damage, race);
    }

    @Override
    public void attack(Hero hero) {
        double totalDamage = this.damage + this.weapon.dealDamage() + RandomAttack.randomAttack();
        super.totalDamage = totalDamage;
        hero.takeDamage(totalDamage);
    }
}
