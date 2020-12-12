package com.omen.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:黄牛购票
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 09:47
 */
public class Huangniu<T> implements InvocationHandler {
    private T target;

    public Huangniu(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是黄牛，你要买什么票");
        System.out.println("-----------------");
        proxy = (T) method.invoke(target,args);
        System.out.println("-----------------");
        System.out.println("好的，请等通知。");
        return proxy;
    }
}
