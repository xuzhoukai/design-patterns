package com.omen.factory.func;

import com.omen.factory.Car;

/**
 * @Description:工厂规范
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:51
 */
public interface FuncFactory {
    /**
     * 符合标准的car
     * @return
     */
    Car getCar();
}
