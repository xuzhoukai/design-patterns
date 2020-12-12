package com.omen.factory.simple;

import com.omen.factory.Audi;
import com.omen.factory.Bmw;
import com.omen.factory.Car;
import com.omen.factory.CarEnum;

/**
 * @Description:汽车工厂
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:36
 */
public class SimpleCarFactory {
    public static Car getCar(String name){
        Car car = null;
        if(CarEnum.Bwm.getName().equalsIgnoreCase(name)){
            car = new Bmw();
        }else if(CarEnum.Audi.getName().equalsIgnoreCase(name)){
            car = new Audi();
        }
        return car;
    }
}
