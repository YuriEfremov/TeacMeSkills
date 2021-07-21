package by.teachmeskills.lection8.BookMagaz;

public class Book implements Printable {
    String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println(bookName);
    }
}
