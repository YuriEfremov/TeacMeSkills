package by.teachmeskills.fifthlection.inclass1;

public class Phone {
    //параметры (переменные); Переменные, определённые внутри класса (не метода),
    // называются переменными экземпляра или полями (fields).
    private String model; //private - модификатор
    private String name;
    private int number;
    int weight;

    //конструкторы
    public Phone() { //конструктор без параметров
    }

    public Phone(int number) { //конструктор с 1 параметром
       this.number = number;  //this - обратиться к переменной ТЕКУЩЕГО объекта - не понимаю
    }

    public Phone(int number, String model) { //конструктор с двумя параметрами
        this.number = number;
        this.model = model;

    }

    public Phone(int number, String model, int weight) {  //конструктор с тремя параметрами
        this(number, model); //вызов из конструктора с тремя параметрами - конструктора с двумя - исп this()

        this.weight = weight;
    }

    //setters&getters

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


    //методы

    public void displayInfo() {
        System.out.printf("Number: %d\tModel: %s\tWeight: %d\n", number, model, weight);
    }

    public void receiveCall(String name) {
        System.out.printf("Calling: %s\n", name);
    }

    public void receiveCall(String name, int number) {   //перегрузка метода
        System.out.printf("Calling: %s\t number %d\n", name, number);
    }

    public void sendMessage( int... arg) { //метод с аргументами переменной длины.

        for (int x : arg) { //For-each — это разновидность цикла for, которая используется,
            // когда нужно обработать все элементы массива или коллекции. https://javarush.ru/groups/posts/for-each-java
           System.out.println("Message sent to № " + x);
        }
    }
}