package com.priyakdey.design.patterns.structural.facade.example2;

/**
 * @author Priyak Dey
 * @since 10-06-2022
 */
public class DrivingFacade {

    public void drive() {
        Ignition ignition = new Ignition();
        Clutch clutch = new Clutch();
        Accelerator accelerator = new Accelerator();
        GearStick gearStick = new GearStick();
        Handbrake handbrake = new Handbrake();

        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelerator.press();
        clutch.lift();
        handbrake.pushDown();
        accelerator.press();
        clutch.press();
    }

}
