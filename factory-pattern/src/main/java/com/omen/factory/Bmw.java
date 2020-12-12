package com.omen.factory;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:37
 */
public class Bmw implements Car {
    @Override
    public void getName() {
        System.out.println(CarEnum.Bwm.getDesc());
    }
}
