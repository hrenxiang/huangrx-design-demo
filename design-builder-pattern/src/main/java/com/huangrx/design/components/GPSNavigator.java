package com.huangrx.design.components;

/**
 * Just another feature of a car.
 *
 * @author    hrenxiang
 * @since     2022/5/5 4:26 PM
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}