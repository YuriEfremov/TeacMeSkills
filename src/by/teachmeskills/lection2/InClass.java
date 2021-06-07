package by.teachmeskills.lection2;
// Сколько пробежал спортсмен за 7 дней
public class InClass {
    public static void main(String[] args) {
        double distance = 10;
        double percent = 0.1;
        double summdist = 10;
        for (int i = 2; i <=7; i++) {
            distance += distance * percent;
            summdist += distance;
            System.out.printf("Per %d day %.2f summary %.2f", i, distance, summdist);
            System.out.println();


        }
        System.out.printf("Total distance = %.2f", summdist);
    }
}
