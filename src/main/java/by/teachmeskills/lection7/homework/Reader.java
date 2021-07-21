package by.teachmeskills.lection7.homework;

public class Reader {
    private String fio;
    private String faculty;
    private String birthDate;
    private int phoneNum;
    private int readerTicketNum;
    private Book books;

    //Constructors

    public Reader(String fio, String faculty, String birthDate, int phoneNum, int readerTicketNum) {
        this.fio = fio;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;
        this.readerTicketNum = readerTicketNum;
    }
//Setters&Getters

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    //Methods

    public void takeBook(int bookquant) {
        System.out.printf("Петров В.В. взял %d\t книги\n", bookquant);
    }

    public void takeBook(String fio, String... books) {
        System.out.printf("%s взял:\t", fio);
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%s ", books[i]);
        }
        System.out.println();
    }

    public void takeBook(String fio, Book... books1) {
        System.out.println(fio + " взял книги: ");
        //for (int i = 0; i < books1.length; i++) {
        for(Book i:books1)
           System.out.println(i.getBookInfo());
       //}

    }

}
