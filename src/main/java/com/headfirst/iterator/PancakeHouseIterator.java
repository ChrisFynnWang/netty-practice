package com.headfirst.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/26 9:17
 */
public class PancakeHouseIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
