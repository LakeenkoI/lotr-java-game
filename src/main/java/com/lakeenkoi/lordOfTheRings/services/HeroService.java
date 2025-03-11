package com.lakeenkoi.lordOfTheRings.services;

import com.github.javafaker.Faker;
import com.lakeenkoi.lordOfTheRings.heroes.*;
import com.lakeenkoi.lordOfTheRings.weapons.Bow;
import com.lakeenkoi.lordOfTheRings.weapons.Magic;
import com.lakeenkoi.lordOfTheRings.weapons.Sword;
import com.lakeenkoi.lordOfTheRings.weapons.Weapon;

import java.util.ArrayList;
import java.util.Random;

public class HeroService {

    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static Hero makeHero(final int playerRace) {
        return switch (playerRace) {
            case 1 -> new Human(Race.HUMAN.getHealth(), Race.HUMAN.getDamage(), Race.HUMAN);
            case 2 -> new Elf(Race.ELF.getHealth(), Race.ELF.getDamage(), Race.ELF);
            case 3 -> new Orc(Race.ORC.getHealth(), Race.ORC.getDamage(), Race.ORC);
            default -> throw new IllegalArgumentException("Выбрано значение за пределами списка");
        };
    }

    public static Weapon makeWeapon(final int playerWeapon) {
        return switch (playerWeapon) {
            case 1 -> new Sword();
            case 2 -> new Bow();
            case 3 -> new Magic();
            default -> null;
        };
    }

    public static String chooseEnemyName() {
        ArrayList<String> enemyNameList = new ArrayList<>();
        enemyNameList.add(FAKER.lordOfTheRings().character());
        enemyNameList.add(FAKER.hobbit().character());
        return enemyNameList.get(RANDOM.nextInt(enemyNameList.size()));
    }
}
