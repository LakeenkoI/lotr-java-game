package com.lakeenkoi.lordOfTheRings;

import com.lakeenkoi.lordOfTheRings.controller.ControllerInput;

public class LOTRGame {

    public static void main(String[] args) {
        ControllerInput controllerInput = new ControllerInput();

        controllerInput.selectRace()
                .inputName()
                .chooseWeapon()
                .createEnemy()
                .fight();
    }
}
