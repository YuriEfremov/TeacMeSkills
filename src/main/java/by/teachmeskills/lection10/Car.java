package by.teachmeskills.lection10;

import java.util.Random;

public class Car {
  private   String brand;
  private   int speed;
   private  int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public void start() throws CarException {
        try {
            Random rnd = new Random();
            int i = rnd.nextInt(21);
            if (i % 2 == 0) {
                throw new CarException(i, brand);

            } else {
                System.out.printf("Car %s is started\n", brand);
            }
        } catch (CarException e) {
        }
        finally {
            System.out.println("Ok");
        }

    }
}
