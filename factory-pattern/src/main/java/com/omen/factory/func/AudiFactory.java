package com.omen.factory.func;

import com.omen.factory.Audi;
import com.omen.factory.Car;

/**
 * @Description: 奥迪工厂
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:52
 */
public class AudiFactory implements FuncFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
