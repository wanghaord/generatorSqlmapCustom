package com.ego;

import java.util.Arrays;

/**
 * @author wanghao
 * @date 2019/4/24.
 */
public class Test3 {

    public static void main(String[] args) {


        Integer[] a = {1, 8, 3, 9, 2, 0, 5};
        Arrays.sort(a, (o1, o2) -> o1 - o2);
    }
}
