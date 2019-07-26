package com.headfirst.templatePattern;


/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/25 9:02
 */
public class MyCollections {

    public static void sort(Object[] a) {

        Object aux[] = (Object[]) a.clone();
        mergeSort(aux, a, 0, a.length, 0);
    }

    private static void mergeSort(Object src[], Object dest[], int low, int high, int off) {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j > low && ((Comparable) dest[j - i]).compareTo((Comparable) dest[j]) > 0; j++) {
                swap(dest, j, j - 1);
            }
        }
    }

    public static void swap(Object[] dest, int first, int second) {

    }

}
