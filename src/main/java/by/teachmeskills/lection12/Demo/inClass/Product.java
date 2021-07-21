package by.teachmeskills.lection12.Demo.inClass;

import java.util.Objects;

public class Product implements Comparable <Product> {
private int id;
private String name;
private Integer price;
private Type type;

    public Product(int id, String name, int price, Type type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }


    @Override
    public int compareTo(Product pr) {
       return price.compareTo(pr.getPrice());
    }
}

    // @Override
   // public boolean equals(Object o) {
    //    if (this == o) return true;
     //   if (o == null || getClass() != o.getClass()) return false;
    //    Product product = (Product) o;
   //    return id == product.id;
  //  }


//}
