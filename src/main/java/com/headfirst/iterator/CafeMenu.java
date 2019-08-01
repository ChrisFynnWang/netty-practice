package com.headfirst.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/30 8:56
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
