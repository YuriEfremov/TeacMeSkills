package by.teachmeskills.lection5;

public class Run {
    public static void main(String[] args) {

        Phone phone = new Phone(8579875,"Iphone 11",200);

        Phone phone1 = new Phone(74589347,"Xiaomi Redmi 9",250);

        Phone phone2 = new Phone();



        phone2.setNumber(14785987);
        phone2.setModel("Realme 6");
        phone2.setWeight(150);

        phone.displayInfo();
        System.out.println();
        phone1.displayInfo();
        System.out.println();
        phone2.displayInfo();
        System.out.println();


        phone.receiveCall("Max");
        int number = phone.getNumber();
        System.out.println(number);
        System.out.println();

        phone.receiveCall("Alex",5487952);

        phone.sendMessage(145877,656877,65687,321346);
    }
}
