package by.teachmeskills.lection6.inClass1;

public class Human {
    private String name;
    private int age;
    private int weight;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private double countIndex() {
        return (double) height / weight;
    }

    public void getInfo() {
        System.out.printf("Name %s\t age %d\t weight %d\t height %d\t index %f\n", name, age, weight, height, countIndex());
    }
}
