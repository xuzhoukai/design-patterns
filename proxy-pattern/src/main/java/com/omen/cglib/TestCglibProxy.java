package com.omen.cglib;

/**
 * @Description:
 * @Auther: xuzhoukai
 * @Date: 2019/3/31 10:21
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        Renter renter = new Renter();
        renter.setName("徐开心");
        Zhongjie zhongjie = new Zhongjie(renter);
        Renter renter1 = (Renter) zhongjie.getTarget();
        renter1.findNewHouse();

    }
}
