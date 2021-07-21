package by.teachmeskills.lection8.BookMagaz;


public class RunPrintable {
    public static void main(String[] args) {
        Printable[] bk = new Printable[4];
        bk[0] = new Book("Book1");
        bk[1] = new Book("Book2");
        bk[2] = new Magazine("Magazine1");
        bk[3] = new Magazine("Magazine2");
        for (int i = 0; i < bk.length; i++) {
            bk[i].print();
        }
        System.out.println();
        Magazine.printMagazines(bk);
    }
}
