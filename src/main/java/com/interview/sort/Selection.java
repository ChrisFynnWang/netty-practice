package com.interview.sort;

import java.util.Arrays;
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
public class Selection
{
    public static int[] sort(int[] arr)
    {
        int less = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    less = arr[j];
                    arr[j] = arr[i];
                    arr[i] = less;
                }
            }
        }
        return arr;
    }

    @Test
    public void test()
    {
        int[] randomArray = ArrayUtils.getRandomArray(10, 1, 100);

        System.out.println(Arrays.toString(randomArray));

        System.out.println(Arrays.toString(sort(randomArray)));
    }
}
