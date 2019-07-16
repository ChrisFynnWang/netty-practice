package com.arithmetic;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Section1 {


    @Test
    public void test1_1() {

        Integer n = 10000000;

        for (int i = 0; i < n; i++) {
            long startTime = System.currentTimeMillis();
            int i1 = n / 2;
            long endTime = System.currentTimeMillis();
            System.out.println(i + " : " + (endTime - startTime));
        }
    }


    @Test
    public void testCount() {
        int i = RandomUtils.nextInt();
        System.out.println(i);
        System.out.println(getOneCount(i));
    }

    private int getOneCount(Integer N) {
        String binaryString = Integer.toBinaryString(N);
        if (N % 2 == 0) {
            return StringUtils.countMatches(binaryString, "1");
        }
        return getOneCount(N / 2);
    }
}
