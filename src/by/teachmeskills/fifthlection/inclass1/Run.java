package by.teachmeskills.fifthlection.inclass1;

public class Run {
    public static void main(String[] args) {
        //создаем 3 объекта (экземпляра) класса Phone.
        // Объект создаётся из существующего класса при помощи ключевого слова new:
        Phone samsung = new Phone();
        Phone xiaomi = new Phone(858684, "Xiaomi", 150);
        Phone iphone = new Phone(858585, "Iphone", 200);

        samsung.setNumber(1591597);
        samsung.setModel("GalaxyS10");
        samsung.setWeight(150);

        samsung.displayInfo();
        xiaomi.displayInfo();
        iphone.displayInfo();
        System.out.println();

        iphone.receiveCall("Vasya");
        System.out.println(iphone.getNumber()); //а так можно?

        iphone.receiveCall("Vasya", 889911);
        samsung.sendMessage(82564,82565,82566);


    }
}
