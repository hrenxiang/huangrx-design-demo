package com.huangrx.design.components;

import com.huangrx.design.car.Car;

/**
 * Just another feature of a car.
 *
 * @author    hrenxiang
 * @since     2022/5/5 4:26 PM
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}