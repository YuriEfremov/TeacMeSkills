package by.teachmeskills.lection10;

public class CarException extends Exception {
    private final int number;
    private final String carBrand;

    public CarException(int number, String carBrand) {
        this.number = number;
        this.carBrand = carBrand;
        System.out.println(number + " " + carBrand + " exception");
    }


}
