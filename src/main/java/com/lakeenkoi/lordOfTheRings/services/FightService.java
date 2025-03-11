package com.lakeenkoi.lordOfTheRings.services;

import com.lakeenkoi.lordOfTheRings.heroes.Hero;

import java.util.Random;

public class FightService {

    private final Random random = new Random();
    private boolean isHeroTurn = random.nextBoolean();

    public void fight(Hero hero, Hero enemy) {
        while (hero.isAlive() && enemy.isAlive()) {
            attackOpponent(hero, enemy);
            checkHealthHeroes(hero, enemy);
            switchTurn();
        }
        printWinner(hero, enemy);
    }

    private void attackOpponent(Hero hero, Hero enemy) {
        if (isHeroTurn) {
            hero.attack(enemy);
            System.out.println("Герой " + hero.getName() + " атаковал врага "
                    + enemy.getName() + " и нанес ему урон " + String.format("%.2f", hero.getTotalDamage()));
        } else {
            enemy.attack(hero);
            System.out.println("Враг " + enemy.getName() + " атаковал героя "
                    + hero.getName() + " и нанес ему урон " + String.format("%.2f", enemy.getTotalDamage()));
        }
    }

    private void checkHealthHeroes(Hero hero, Hero enemy) {
        System.out.println("Здоровье героя: " + String.format("%.2f", hero.getHealth()));
        System.out.println("Здоровье врага: " + String.format("%.2f", enemy.getHealth()));
        System.out.println();
    }

    private void switchTurn() {
        isHeroTurn = !isHeroTurn;
    }

    private void printWinner(Hero hero, Hero enemy) {
        if (hero.isAlive()) {
            System.out.println("Победил герой " + hero.getName() + "!");
        } else {
            System.out.println("Победил враг " + enemy.getName() + "!");
        }
    }
}
