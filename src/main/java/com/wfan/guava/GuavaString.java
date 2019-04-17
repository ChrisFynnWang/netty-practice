package com.wfan.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.primitives.Ints;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/25
 * @Other:
 */
public class GuavaString {

  @Test
  public void guavaJoinerTest() {

    Joiner joiner = Joiner.on(" ");
    String join = joiner.skipNulls().join("LeBron", null, "James", null);
    System.out.println(join);

    Map<String, String> hashMap = new HashMap();
    hashMap.put("23", "james");
    hashMap.put("24", "bryant");
    String mapJoin = Joiner.on("\r\n").withKeyValueSeparator("=").join(hashMap);
    System.out.println(mapJoin);

  }

  @Test
  public void guavaSplitterTest() {
    String hello = "hello, world!!";
    Iterable<String> split = Splitter.on(",").split(hello);
    for (String s : split) {
      System.out.println(s);
    }
    Iterable<String> fixsplit = Splitter.fixedLength(2).split(hello);
    for (String s : fixsplit) {
      System.out.println(s);
    }
  }

  @Test
  public void innerTest() {

    Inner.on("good").print();
    Inner.on("good").withMsg().print();

  }

  @Test
  public void guavaBaseTest() {
    int[] array = {1, 2, 3, 4, 5, 6};
    int max = Ints.max(array);
    System.out.println(max);
  }

}
