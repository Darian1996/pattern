package com.darian.pattern_23._19_COR;

public class MainClass {
    public static void main(String[] args) {
        CarHandler headH = new CarHeadHandler();
        CarHandler bodyH = new CarBodyHandler();
        CarHandler tailH = new CarTailHandler();

        headH.HandlerCar();
        bodyH.HandlerCar();
        tailH.HandlerCar();
    }
}
