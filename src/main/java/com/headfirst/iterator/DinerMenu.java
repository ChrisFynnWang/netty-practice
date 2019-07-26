package com.headfirst.iterator;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/26 9:15
 */
public class DinerMenu {

    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    MenuItem[] menuItems;

    public Iterator createIterator() {

        return new DinerMenuIterator(menuItems);
    }
}
