package com.omen.factory;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:38
 */
public class Audi implements Car{
    @Override
    public void getName() {
        System.out.println(CarEnum.Audi.getDesc());
    }
}
