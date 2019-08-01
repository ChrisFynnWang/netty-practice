package com.algorithmDiagram;

import com.alibaba.druid.support.json.JSONUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/31 19:23
 */
public class BinarySearch {


    @Test
    public void test() {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int j = RandomUtils.nextInt(0, 99);
            if (!numList.contains(j)) {
                numList.add(j);
            }
        }
        numList.sort((o1, o2) -> o1 - o2);
        System.out.println(JSONUtils.toJSONString(numList));
        System.out.println(search(numList, 35, 0, numList.size() - 1));
    }

    public int search(List<Integer> list, int num, int start, int end) {
        int position = (end + start) / 2;
        if ((end - start) / 2 == 0) {
            return -1;
        }
        if (Integer.compare(list.get(position), num) > 0) {
            return search(list, num, start, position);
        } else if (Integer.compare(list.get(position), num) < 0) {
            return search(list, num, position, end);
        } else {
            return position;
        }
    }
}
