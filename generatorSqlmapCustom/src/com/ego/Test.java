package com.ego;

import java.text.DecimalFormat;

/**
 * @author wanghao
 * @date 2019/4/24.
 */
public class Test {
    public static void main(String[] args) {
        int temp8 = 1;
        DecimalFormat df8 = new DecimalFormat("00000000");
        String str = df8.format(1);
        System.out.println(str);
    }
}
