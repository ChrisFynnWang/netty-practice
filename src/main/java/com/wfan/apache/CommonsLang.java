package com.wfan.apache;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.apache.commons.beanutils.BasicDynaClass;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.Bag;
import org.apache.commons.collections.Factory;
import org.apache.commons.collections.bag.HashBag;
import org.apache.commons.collections.list.LazyList;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
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
public class CommonsLang {

  @Test
  public void stringTest() {

    System.out.println(StringUtils.isEmpty(" "));
    System.out.println(StringUtils.isBlank(""));
    System.out.println(StringUtils.isNumeric("1"));
    System.out.println(StringUtils.left("abcdefg", 2));
    System.out.println(StringUtils.center("abcdefg", 3));
    System.out.println(StringUtils.countMatches("abcdefg", "a"));
    System.out.println(StringEscapeUtils.escapeXml("str"));
    System.out.println(RandomStringUtils.randomAlphabetic(10));
    System.out.println(RandomStringUtils.randomAlphanumeric(10));
    System.out.println(WordUtils.capitalize("abd"));
    System.out.println(HashCodeBuilder.reflectionHashCode("1"));
  }

  @Test
  public void objectTest() {

    System.out.println(new Person("chris", 26).toString());

    MutableInt mutableInt = new MutableInt(10);
    mutableInt.add(10);
    mutableInt.addAndGet(10);
    mutableInt.increment();
    System.out.println(mutableInt);
  }


  @Test
  public void dateUtilsTest() {

    Date date = new Date();
    System.out.println(date);
    System.out.println(DateUtils.addDays(date, -1));
    System.out.println(DateUtils.getFragmentInDays(date, 1));
    long millisPerSecond = DateUtils.MILLIS_PER_SECOND;
    System.out.println(31 + 28 + 25);
  }

  @Test
  public void dateFormatUtilsTest() {

    String format = DateFormatUtils.format(new Date(), "yyyy");
    System.out.println(format);
  }

  @Test
  public void arrayUtilsTest() {
    int[] i = {1, 2, 3, 4, 5, 6, 7};
    int max = NumberUtils.max(i);
    System.out.println(max);
  }

  @Test
  public void beanUtilsTest()
      throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

    Person person = new Person("chris", 26);
    User user = new User();

    PropertyUtils.copyProperties(user, person);
    System.out.println(user.getAge());
    System.out.println(person.getAge());

  }

  @Test
  public void dynaBeanTest() throws InstantiationException, IllegalAccessException {
    DynaProperty[] dynaProperties = new DynaProperty[]{
        new DynaProperty("name", String.class),
        new DynaProperty("age", int.class)
    };
    BasicDynaClass people = new BasicDynaClass("People", null, dynaProperties);
    DynaBean dynaBean = people.newInstance();
    dynaBean.set("name", "chris");
    dynaBean.set("age", 11);
    System.out.println(dynaBean.get("name"));
  }

  @Test
  public void collectionsTest() {

    Bag bag = new HashBag(Arrays.asList("red", "orange", "yellow", "green"));
    bag.add("blue", 3);
    System.out.println(bag.size());
    System.out.println(bag.getCount("blue"));
  }

  @Test
  public void lazyTest() {
    List<String> list = LazyList.decorate(new ArrayList(), new Factory() {
      @Override
      public String create() {
        return "A";
      }
    });
    System.out.println(list.size());
    list.get(3);
    list.add("B");
    System.out.println(list);
  }
}