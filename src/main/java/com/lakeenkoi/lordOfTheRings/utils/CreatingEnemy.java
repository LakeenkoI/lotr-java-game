package com.lakeenkoi.lordOfTheRings.utils;

import com.lakeenkoi.lordOfTheRings.heroes.Hero;
import com.lakeenkoi.lordOfTheRings.services.HeroService;

import java.util.Random;

public class CreatingEnemy {

    public static Hero createEnemy() {
        Hero enemy;
        Random random = new Random();
        int computerRace = random.nextInt(3) + 1;
        int computerWeapon = random.nextInt(3) + 1;
        enemy = HeroService.makeHero(computerRace);
        enemy.setName(HeroService.chooseEnemyName());
        enemy.setWeapon(HeroService.makeWeapon(computerWeapon));
        return enemy;
    }
}



