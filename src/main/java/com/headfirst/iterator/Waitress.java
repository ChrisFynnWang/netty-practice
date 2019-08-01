package com.headfirst.iterator;

import java.util.Iterator;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/26 9:26
 */
public class Waitress {

    Menu pancakeHouseMenu;

    Menu dinerMenu;

    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator cafeMenuIterator = cafeMenu.createIterator();
        dinerMenuIterator.remove();
        System.out.println();
        printMenu();

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
        }
    }
}
