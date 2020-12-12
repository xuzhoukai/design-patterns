package com.omen.factory.func;

import com.omen.factory.Bmw;
import com.omen.factory.Car;

/**
 * @Description:宝马工厂
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:52
 */
public class BmwFactory implements FuncFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
