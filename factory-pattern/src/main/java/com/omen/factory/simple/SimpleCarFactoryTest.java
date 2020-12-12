package com.omen.factory.simple;

import com.omen.factory.Car;
import com.omen.factory.CarEnum;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:39
 */
public class SimpleCarFactoryTest {
    public static void main(String[] args) {
        Car car = SimpleCarFactory.getCar(CarEnum.Bwm.getName());
        car.getName();
    }
}
