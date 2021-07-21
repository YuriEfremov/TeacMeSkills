package by.teachmeskills.lection7.homework;

public class Book {
    private String author;
    private String bookname;

    public Book(String author, String bookname) {
        this.author = author;
        this.bookname = bookname;
    }

    public String getBookInfo() {
        return author + " " + bookname;
    }
}
