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
public class Quick
{
    private static int boundary(int[] array, int startIndex, int endIndex)
    {
        int standard = array[startIndex]; // 定义标准
        int leftIndex = startIndex; // 左指针
        int rightIndex = endIndex; // 右指针

        while (leftIndex < rightIndex)
        {
            while (leftIndex < rightIndex && array[rightIndex] >= standard)
            {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];

            while (leftIndex < rightIndex && array[leftIndex] <= standard)
            {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
        }

        array[leftIndex] = standard;
        return leftIndex;
    }

    private static void sortCore(int[] array, int startIndex, int endIndex)
    {
        if (startIndex >= endIndex)
        {
            return;
        }

        int boundary = boundary(array, startIndex, endIndex);

        sortCore(array, startIndex, boundary - 1);
        sortCore(array, boundary + 1, endIndex);
    }

    @Test
    public void test()
    {
        int[] arr = ArrayUtils.getRandomArray(10, 1, 100);
        System.out.println(Arrays.toString(arr));
//        int[] arr = {54, 26, 64, 76, 59, 94, 97, 37, 20, 43};
//        sort2(arr, 0, arr.length - 1);
        sortCore(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public int sort(int[] arr, int startIndex, int endIndex)
    {
        int standard = arr[startIndex];
        int leftPointer = startIndex;
        int rightPointer = endIndex;
        while (leftPointer < rightPointer)
        {
            while (leftPointer < rightPointer && arr[rightPointer] >= standard)
            {
                rightPointer--;
            }
            arr[leftPointer] = arr[rightPointer];

            while (leftPointer < rightPointer && arr[leftPointer] <= standard)
            {
                leftPointer++;
            }
            arr[rightPointer] = arr[leftPointer];
        }
        arr[leftPointer] = standard;
        return leftPointer;
    }
}
