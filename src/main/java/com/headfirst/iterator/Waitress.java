package com.headfirst.iterator;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/7/26 9:26
 */
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;

    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
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
