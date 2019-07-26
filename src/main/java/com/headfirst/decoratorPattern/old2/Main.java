package com.headfirst.decoratorPattern.old2;

import com.headfirst.decoratorPattern.old2.coffee.AbstractBeverage;
import com.headfirst.decoratorPattern.old2.coffee.DarkRoast;
import com.headfirst.decoratorPattern.old2.flavour.Mocha;
import com.headfirst.decoratorPattern.old2.flavour.Soy;
import com.headfirst.decoratorPattern.old2.flavour.Whip;
import com.headfirst.decoratorPattern.old2.size.CoffeeSize;
import com.headfirst.decoratorPattern.old2.size.FlavourSize;
import java.util.Arrays;
import java.util.List;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/31
 * @Other:
 */
public class Main {

  public static void main(String[] args) {

//    DarkRoast darkRoast = new DarkRoast(1.5);
//    Whip whip = (Whip) new Whip(new Mocha(darkRoast).setPrice(1.5)).setPrice(2.5);
//    System.out.println(whip.cost());
//    System.out.println(whip.getDescription());
//    System.out.println(CoffeeSilistze.TALL.getPrice());
//    String name = CoffeeSize.TALL.name();
//    System.out.println(name);
//    List<FlavourSize> flavourSizes = MyCollections.asList(FlavourSize.values());
//    boolean contains = flavourSizes.contains(CoffeeSize.TALL);
//    System.out.println(contains);
//    System.out.println(FlavourSize.TALL.hashCode());
//    System.out.println(CoffeeSize.TALL.hashCode());
//    System.out.println(FlavourSize.TALL.name().equals(CoffeeSize.TALL.name()));

    DarkRoast darkRoast = new DarkRoast(CoffeeSize.TALL);
    System.out.println(darkRoast.cost());
    Mocha mocha = new Mocha(darkRoast);
    System.out.println(mocha.cost());
    Soy soy = new Soy(mocha);
    System.out.println(soy.cost());
    Whip whip = new Whip(soy);
    System.out.println(whip.cost());

  }
}
