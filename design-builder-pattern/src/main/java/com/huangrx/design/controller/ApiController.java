package com.huangrx.design.controller;

import com.huangrx.design.builder.Builder;
import com.huangrx.design.builder.CarBuilder;
import com.huangrx.design.builder.CarManualBuilder;
import com.huangrx.design.car.Car;
import com.huangrx.design.car.CarType;
import com.huangrx.design.car.Manual;
import com.huangrx.design.components.Engine;
import com.huangrx.design.components.GPSNavigator;
import com.huangrx.design.components.Transmission;
import com.huangrx.design.components.TripComputer;

/**
 * ApiController defines the order of building steps.
 * It works with a builder object  through common Builder interface.
 * Therefore, it may not know what product is being built.
 *
 * @author hrenxiang
 * @since 2022-05-05 4:29 PM
 */
public class ApiController {

    public static void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public static void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public static void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public static void main(String[] args) {

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
