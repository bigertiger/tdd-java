package com.coding;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangyu
 * @Description:
 * @Date: 2019/6/28 11:19
 * @Modify:
 */
public class Member {
    public static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(30, 60);
        map.put(50, 100);
        map.put(20, 40);
    }

    private int points;

    public void recharge(int money) {
        if (null == map.get(money)) {
            throw new IllegalArgumentException("充值金额应为20，30,或50");
        }
        points += map.get(money);

    }

    public int getPoints() {
        return points;
    }
}
