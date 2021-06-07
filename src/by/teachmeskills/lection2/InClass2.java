package by.teachmeskills.lection2;

//количество амеб через 3-6-9...24 часа
public class InClass2 {
    public static void main(String[] args) {
        int ameba = 1;
        for (int i = 3; i <= 24; i += 3) {
            System.out.print(i);
            ameba = ameba * 2;
            System.out.println("ameba = " + ameba);
        }
        System.out.println("Ameba total number " + ameba);
        //System.out.printf(); /n?
    }

}
