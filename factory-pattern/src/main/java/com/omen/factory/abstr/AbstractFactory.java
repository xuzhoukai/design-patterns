package com.omen.factory.abstr;

import com.omen.factory.Audi;
import com.omen.factory.Bmw;
import com.omen.factory.Car;
import com.omen.factory.CarEnum;

/**
 * @Description:抽象工厂类
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:57
 */
public abstract class AbstractFactory {

    protected abstract Car getCar();
}
