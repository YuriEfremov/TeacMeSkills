package by.teachmeskills.lection12.Demo.inClass;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Shop {
    private List<Product> shopS;

    public Shop(List<Product> shopS) {
        this.shopS = shopS;
    }

    // ArrayList<Product> myShop =new ArrayList<>();
    public boolean addProduct(Product prod) {
        if (!shopS.contains(prod)) {
            return shopS.add(prod);
        }
        System.out.println("This product was inserted");
        return false;
    }

    public void showAll() {
        shopS.forEach(p -> System.out.println(p)); //https://vertex-academy.com/tutorials/ru/java-8-foreach/
       // shopS.forEach(product -> System.out.println(product));
        //for (Product p : myShop) {
       // System.out.println(10);
                //  }
    }

    public void deleteProd(int id) {
        Iterator<Product> iterator = shopS.iterator(); //https://metanit.com/java/tutorial/5.10.php
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }

    }

    public void changeProd(Product p) {
        for (Product prod : shopS) {
            if (prod.getId() == p.getId()) {
                prod.setName(p.getName());
                prod.setPrice(p.getPrice());
                prod.setType(p.getType());
            }
        }
    }

    public void sortProd() {
        Collections.sort(shopS);
    }
}

