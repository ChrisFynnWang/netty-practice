package com.interview.sort;

import org.apache.commons.lang3.RandomUtils;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/8
 * @Other:
 */
public class ArrayUtils
{
    private ArrayUtils()
    {

    }

    public static int[] getRandomArray(int length, int start, int end)
    {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
        {
            arr[i] = RandomUtils.nextInt(start, end);
        }
        return arr;
    }
}
