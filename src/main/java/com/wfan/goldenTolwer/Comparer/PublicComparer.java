package com.wfan.goldenTolwer.Comparer;

import java.util.Comparator;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/10
 * @Other:
 */
public class PublicComparer implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {

        return o1 > o2 ? 1 : (o1 == o2 ? 0 : -1);
    }
}
