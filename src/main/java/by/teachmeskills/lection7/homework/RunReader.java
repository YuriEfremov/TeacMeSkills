package by.teachmeskills.lection7.homework;

public class RunReader {
    public static void main(String[] args) {
        Reader one = new Reader("Petrov V.V.", "KTF", "01.01.1980", 2526245, 152);
        one.takeBook(3);
        System.out.println();
        one.takeBook(one.getFio(), "Приключения", "Словарь", "Энциклопедия");
        System.out.println();
        one.takeBook(one.getFio(), new Book("Jhon Jhonson", "Adventures"), new Book("People", "Vocabulary"));
    }
}
