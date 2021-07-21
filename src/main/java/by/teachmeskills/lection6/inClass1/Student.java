package by.teachmeskills.lection6.inClass1;

public class Student {
    private String name;
    private int age;
    private double avScore;
    private String rtn;

    public Student(String name, int age, double avScore) {
        this.name = name;
        this.age = age;
        this.avScore = avScore;
    }

    public String printInfoStudent(){
        rtn="Name: " + name + " age: " + age + " avScore: "+ avScore;
        return rtn;
        //return ("Name: " + name + " age: " + age + " avScore: "+ avScore);
    }
}
