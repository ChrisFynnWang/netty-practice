package com.interview.lock;

import org.junit.Test;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/7/4
 * @Other:
 */
public class PaperTest {

  /**
   * a张10块，b张5块，c张2块，现在买一个东西需要n块，问在不找零的情况下，是否可以刚好购置成功。
   */
  public static boolean findWay(int a, int b, int c, int n) {
    boolean isOdd = n % 2 == 0 ? false : true;
    int total = a * 10 + b * 5 + c * 2;
    if (total < n) {
      return false;
    }
    if (total == n) {
      return true;
    }
    int ac = 0;
    int bc = 0;
    int cc = 0;
    int left = 0;//用来装余数
    int an = n / 10;
    if (an > a) {
      left = n - a * 10;
      ac = a;
    } else {
      left = n - an * 10;
      ac = an;
    }
    int bn = left / 5;
    if (isOdd && bn % 2 == 0) {
      if (bn == 0) {
        ac = ac == 0 ? 0 : ac - 1;
      }
      bn -= 1;
    }
    if (bn > b) {
      left = left - b * 5;
      bc = b;
    } else {
      left = left - bn * 5;
      bc = bn < 0 ? 1 : bn;
    }
    int cn = left / 2;
    if (cn > c) {
      left = left - c * 2;
      cc = c;
    } else {
      left = left - cn * 2;
      cc = cn;
    }
    System.out.println(String.format("a:%d ,b:%d ,c:%d", ac, bc, cc));
    if (left == 0) {
      return true;
    } else {
      return false;
    }
  }

  @Test
  public void testFindWay() {
    boolean way = findWay(1, 3, 4, 31);
    System.out.println(way);
  }
}
