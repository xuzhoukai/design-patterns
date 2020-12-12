package com.omen.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:租房中介公司
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 10:12
 */
public class Zhongjie<T>{
    private T target;

    public Zhongjie(T target) {
        this.target = target;
    }
    public T getTarget(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("我是租房中介,请说您的要求。");
                System.out.println("----------------------");
                method.invoke(target,args);
                System.out.println("----------------------");
                System.out.println("好的,请回去等消息.");
                return proxy;
            }
        });
        return (T) enhancer.create();
    }
}
