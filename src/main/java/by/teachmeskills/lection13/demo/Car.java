package by.teachmeskills.lection13.demo;

class Car {
    private String name;
    private boolean isFullDrive;
    private boolean isGasEngine;

    public Car(String name, boolean isFullDrive, boolean isGasEngine) {
        this.name = name;
        this.isFullDrive = isFullDrive;
        this.isGasEngine = isGasEngine;
    }

    public boolean isFullDrive() {
        return isFullDrive;
    }

    public boolean isGasEngine() {
        return isGasEngine;
    }

    @Override
    public String toString() {
        return name;
    }




public class Example {
    private static void printTest(Car car, CheckCar check) {
        if (check.testC(car)) {
            System.out.println(car);
        }
    }
}

    public static void main(String[] args) {
        Car audiA3 = new Car("AudiA3", true, true);
        Car audiA6 = new Car("AudiA6", true, false);
        Example.printTest(audiA3, car -> car.isFullDrive);
        Example.printTest(audiA3, car -> car.isGasEngine);
        Example.printTest(audiA6, car -> car.isFullDrive);
        Example.printTest(audiA6, car -> car.isGasEngine);
    }
}
@FunctionalInterface
interface CheckCar {
    boolean testC(Car car);
}