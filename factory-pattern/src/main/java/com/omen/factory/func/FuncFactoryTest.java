package com.omen.factory.func;

import com.omen.factory.Car;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:53
 */
public class FuncFactoryTest {
    public static void main(String[] args) {
        FuncFactory factory = new AudiFactory();
        Car car = factory.getCar();
        car.getName();
    }
}
