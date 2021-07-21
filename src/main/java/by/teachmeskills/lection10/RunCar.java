package by.teachmeskills.lection10;

public class RunCar {
    public static void main(String[] args) throws CarException {
        Car car1 = new Car("BMW", 200, 15000);
        Car car2 = new Car("Volvo", 180, 10000);
        Car car3 = new Car("Toyota", 160, 8900);
    car1.start();
    car2.start();
    car3.start();
}
}
