package com.omen.cglib;

/**
 * @Description:租客 租房子
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 10:10
 */
public class Renter {
    private String name;
    public void findNewHouse(){
        System.out.println(this.name+"要租一套三室的房子");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
