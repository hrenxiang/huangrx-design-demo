package com.huangrx.design.builder;

import com.huangrx.design.car.Car;
import com.huangrx.design.car.CarType;
import com.huangrx.design.components.Engine;
import com.huangrx.design.components.GPSNavigator;
import com.huangrx.design.components.Transmission;
import com.huangrx.design.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 * 具体构建器实现公共接口中定义的步骤。
 *
 * @author    hrenxiang
 * @since     2022/5/5 4:22 PM
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}