package com.huangrx.design.builder;

import com.huangrx.design.car.CarType;
import com.huangrx.design.components.Engine;
import com.huangrx.design.components.GPSNavigator;
import com.huangrx.design.components.Transmission;
import com.huangrx.design.components.TripComputer;

/**
 * 通用生成器接口
 *
 * Builder interface defines all possible ways to configure a product.
 * 构建器接口定义了配置产品的所有可能方法。
 *
 * @author hrenxiang
 * @since 2022-05-05 4:20 PM
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
