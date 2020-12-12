package com.omen.jdk;

/**
 * @Description: 买火车票的学生
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 09:44
 */
public class Student implements Person{
    private String name;
    @Override
    public void buyTicket() {
        System.out.println(this.name + "要买火车票回安徽老家");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
