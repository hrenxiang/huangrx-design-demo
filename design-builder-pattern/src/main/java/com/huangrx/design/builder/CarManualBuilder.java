package com.huangrx.design.builder;

import com.huangrx.design.car.CarType;
import com.huangrx.design.car.Manual;
import com.huangrx.design.components.Engine;
import com.huangrx.design.components.GPSNavigator;
import com.huangrx.design.components.Transmission;
import com.huangrx.design.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 * 与其他创建模式不同，Builder可以构造不相关的产品，这些产品没有公共接口。
 *
 * In this case we build a user manual for a car, using the same steps as we built a car.
 * This allows to produce manuals for specific car models, configured with different features.
 * 在本例中，我们构建了一辆汽车的用户手册，使用与构建汽车相同的步骤。这允许为特定的汽车模型生产手册，配置不同的功能。
 */
public class CarManualBuilder implements Builder{
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}