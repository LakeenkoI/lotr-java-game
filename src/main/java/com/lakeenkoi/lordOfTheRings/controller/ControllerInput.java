
package com.lakeenkoi.lordOfTheRings.controller;

import com.lakeenkoi.lordOfTheRings.heroes.Hero;
import com.lakeenkoi.lordOfTheRings.services.FightService;
import com.lakeenkoi.lordOfTheRings.services.HeroService;
import com.lakeenkoi.lordOfTheRings.utils.CreatingEnemy;

import java.util.Scanner;

public class ControllerInput {

    private Hero hero;
    private Hero enemy;
    private final Scanner scanner = new Scanner(System.in);
    private final FightService fightService = new FightService();

    public ControllerInput selectRace() {
        System.out.println("\nДобро пожаловать в игру Властелин колец!\n");
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Выберите расу игрока, введя соответствующую цифру:\nЧеловек: 1" +
                    "\nЭльф: 2\nОрк: 3\n\nВаш выбор: ");
            int playerRace = scanner.nextInt();

            try {
                hero = HeroService.makeHero(playerRace);
            } catch (Exception e) {
                System.out.println("\nВыбрано значение за пределами списка. Вы получили ошибку: " + e + "\n");
                continue;
            } finally {
                if (hero != null) {
                    isRunning = false;
                    System.out.println("Вы выбрали расу: " + hero.getRace().getDisplayName());
                }
            }
            scanner.nextLine();
        }
        return this;
    }

    public ControllerInput inputName() {
        System.out.print("\nВведите имя игрока: ");
        String playerName = scanner.nextLine();
        hero.setName(playerName);
        return this;
    }

    public ControllerInput chooseWeapon() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("\nВыберите оружие:\nМеч: 1" + "\nЛук: 2" + "\nМагия: 3" + "\n\nВаш выбор: ");
            int playerWeapon = scanner.nextInt();

            switch (playerWeapon) {
                case 1 -> {
                    System.out.println("Выбран меч\n");
                    isRunning = false;
                    hero.setWeapon(HeroService.makeWeapon(playerWeapon));
                }
                case 2 -> {
                    System.out.println("Выбран лук\n");
                    isRunning = false;
                    hero.setWeapon(HeroService.makeWeapon(playerWeapon));
                }
                case 3 -> {
                    System.out.println("Выбрана магия\n");
                    isRunning = false;
                    hero.setWeapon(HeroService.makeWeapon(playerWeapon));
                }
                default -> System.out.println("Такого значения нет в списке\n");
            }
        }
        return this;
    }

    public ControllerInput createEnemy() {
        enemy = CreatingEnemy.createEnemy();
        return this;
    }

    public void fight() {
        System.out.println("\n Да начнется битва!\n");
        fightService.fight(hero, enemy);
    }
}

