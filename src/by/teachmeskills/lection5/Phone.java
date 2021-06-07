package by.teachmeskills.lection5;

public class Phone {
    private int number;
    private String model;
    private int weight;


    public Phone() {
    }

    public Phone(int number) {
        //System.out.println(number);
        this.number = number;
    }


    public Phone(String model, int weight) {
        this.model = model;
       this.weight = weight;
    }

    public Phone(int number, String model, int weight) {
        this(model, weight);
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.printf("Number: %d\nModel: %s\nWeight: %d\n", number, model, weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "\nНомер телефона: " + number);
    }

    public void sendMessage(int... number) {
        for (int i : number) {
            System.out.println("Сообщение отправлено на номер: " + i);
        }
    }
}