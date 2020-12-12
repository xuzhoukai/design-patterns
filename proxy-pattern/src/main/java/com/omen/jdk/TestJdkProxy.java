package com.omen.jdk;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 09:58
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("徐开心");
        System.out.println("代理前 student:"+student.getClass());
        Huangniu huangniu = new Huangniu(student);
        Person person = (Person) Proxy.newProxyInstance(student.getClass().getClassLoader(),student.getClass().getInterfaces(),huangniu);
        person.buyTicket();
        System.out.println("代理后 买票的对象："+person.getClass());
    }
}
