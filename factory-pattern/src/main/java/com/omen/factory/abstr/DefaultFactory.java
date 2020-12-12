package com.omen.factory.abstr;

import com.omen.factory.Audi;
import com.omen.factory.Car;
import com.omen.factory.CarEnum;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 12:02
 */
public class DefaultFactory extends AbstractFactory {

    @Override
    protected Car getCar() {
        return new AudiFactory().getCar();

    }
    protected Car getCar(String name){
        Car car = null;
        if(CarEnum.Audi.getName().equalsIgnoreCase(name)){
            car = new AudiFactory().getCar();
        }else if(CarEnum.Bwm.getName().equalsIgnoreCase(name)){
            car = new BmwFactory().getCar();
        }
        return car;
    }
}
