package by.teachmeskills.lection8.BookMagaz;

public class Magazine implements Printable {
    String magazinName;

    public Magazine(String magazinName) {
        this.magazinName = magazinName;
    }

    @Override
    public void print() {
        System.out.println(magazinName);
    }
    static void printMagazines(Printable[] prn){
        for(Printable i: prn){
            if(i instanceof Magazine){
                i.print();
            }
        }
       }
}
