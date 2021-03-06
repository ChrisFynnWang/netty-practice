package com.headfirst.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/26 9:27
 */
public class PancakeHouseMenu implements Menu {

    List<MenuItem> menuItems;

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
