package com.interview.sort;

import java.util.Arrays;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/8
 * @Other:
 */
public class Bubble
{
    //每趟将最大的排到最后

    public static int[] sort(int[] arr)
    {
        int larger = 0;
        for (int i = arr.length - 1; i > 0; i--) //需要比较多少趟
        {
            for (int j = 0; j < i; j++) //每趟需要多少次比较
            {
                if (arr[j] > arr[j + 1])
                {
                    larger = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = larger;
                }
            }
        }
        return arr;
    }

    @Test
    public void test()
    {
        int[] arr = ArrayUtils.getRandomArray(10, 1, 100);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(sort(arr)));
    }
}
