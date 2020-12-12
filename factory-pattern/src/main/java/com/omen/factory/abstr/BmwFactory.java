package com.omen.factory.abstr;

import com.omen.factory.Bmw;
import com.omen.factory.Car;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 12:01
 */
public class BmwFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new Bmw();
    }
}
