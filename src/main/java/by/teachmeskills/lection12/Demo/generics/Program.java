package by.teachmeskills.lection12.Demo.generics;

public class Program {
    public static void main(String[] args) {
        Printer prn = new Printer();
        String[] people = {"Bob", "Nick", "Mike"};
        Integer[] digits = {123, 321, 456, 654};
        prn.<String>print(people);
        prn.print(digits); //Указание типа,  похоже, необязательно.
    }
}
