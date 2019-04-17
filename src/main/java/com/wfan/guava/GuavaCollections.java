package com.wfan.guava;

import com.google.common.base.Predicate;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public class GuavaCollections {

  @Test
  public void guavaCollectionsTest() {
    ImmutableList<String> list = ImmutableList.of("a", "b", "c");
    ImmutableMap<Integer, String> map = ImmutableMap.of(1, "one", 2, "two", 3, "three");
    Multimap<String, String> multimap = ArrayListMultimap.create();
    for (String s : list) {
      System.out.println(s);
    }
    ImmutableSet<Integer> integers = map.keySet();
    for (Integer i : integers) {
      System.out.println(map.get(i));
    }
    multimap.put("chris", "1111111");
    multimap.put("chris", "2222222");
    Collection<String> chris = multimap.get("chris");
    for (String s : chris) {
      System.out.println(s);
    }

    HashBasedTable<Integer, Integer, String> table = HashBasedTable
        .create();
    table.put(1, 2, "3");
    table.put(1, 3, "4");
    Collection<String> values = table.values();
    Map<Integer, Map<Integer, String>> integerMapMap = table.rowMap();
    Set<Integer> integers1 = integerMapMap.keySet();
    for (Integer i : integers1) {
      System.out.println(integerMapMap.get(i));
    }

    Set<Integer> columnKeySet = table.columnKeySet();
    Set<Integer> row = table.rowKeySet();

    HashMap<String, Integer> hashMap = new HashMap();
    hashMap.put("zhangsan", 1);
    hashMap.put("lisi", 2);
    hashMap.put("wangwu", 3);
    Map<String, Integer> filterMap = Maps.filterValues(hashMap, new Predicate<Integer>() {

      @Override
      public boolean apply(@Nullable Integer input) {

        return input > 1;
      }
    });

    System.out.println(filterMap.get("wangwu"));

  }

  public void get(@Nonnull String str) {

    System.out.println(str);
  }

}
