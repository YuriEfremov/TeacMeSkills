package by.teachmeskills.lection1;

public class HomeWork7 {
    public static void main(String[] args) {


        int programmer = 100113;
        int prg = programmer;
        String endtext = null;

        if (programmer > 100) {
            programmer = programmer % 100;
            System.out.println(programmer);

        }
        if (programmer > 20) {
            programmer = programmer % 10;
        }

        switch (programmer) {
            case 1:
                endtext = null;
                break;
            case 2:
            case 3:
            case 4:
                endtext = "а";
                break;
            default:
                endtext = "ов";
                break;
        }
        {
            System.out.println(prg + " программист" + endtext);
        }
    }

}
