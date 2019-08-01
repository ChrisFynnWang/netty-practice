package com.headfirst.iterator;

import java.util.Iterator;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/26 9:13
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
