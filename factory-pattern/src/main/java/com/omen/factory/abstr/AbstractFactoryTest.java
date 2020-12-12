package com.omen.factory.abstr;

import com.omen.factory.Car;
import com.omen.factory.CarEnum;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 12:02
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        Car car = factory.getCar();
        car.getName();
        car = factory.getCar(CarEnum.Bwm.getName());
        car.getName();
    }
}
