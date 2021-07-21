package by.teachmeskills.lection6.inClass1.studentFromVova;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("106519",new Student("Max",25,10),new Student("Ivan",20,5),new Student("Alex",35,2));
        group.getInfoStudents();
    }
}