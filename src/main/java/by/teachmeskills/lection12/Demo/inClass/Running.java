package by.teachmeskills.lection12.Demo.inClass;

import java.util.*;
public class Running {
    public static void main(String[] args) {
        Shop myShop = new Shop (new ArrayList<>());
        myShop.addProduct(new Product(45,"TV_set", 150, Type.BestSeller));
        myShop.addProduct(new Product(15,"DVD", 105, Type.Regular));
        myShop.addProduct(new Product(25,"Phone", 200, Type.Special));
        myShop.showAll();
       // myShop.deleteProd(10);
        System.out.println("--------------------");
       // myShop.showAll();
       // myShop.changeProd(new Product(15,"VHR", 99, Type.Special));
       // System.out.println("--------------------");
      //  myShop.showAll();
        myShop.sortProd();
        System.out.println("--------------------");
        myShop.showAll();

    }
}
