package com.lakeenkoi.lordOfTheRings.utils;

import java.util.Random;

public class RandomAttack {

    private static Random random = new Random();

    public static double randomAttack() {
        return random.nextDouble(1, 15);
    }
}
