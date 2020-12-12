package com.omen.factory;

/**
 * @Description:汽车类型定义
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 11:40
 */
public enum CarEnum {
    Bwm("BWM","宝马"),Audi("Audi","奥迪");
    private String name;
    private String desc;

    private CarEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
