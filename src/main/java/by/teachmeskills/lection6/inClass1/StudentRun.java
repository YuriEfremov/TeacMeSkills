package by.teachmeskills.lection6.inClass1;


public class StudentRun {
    public static void main(String[] args) {
       // Group gr;
       // String name;
       Student [] students = new Student[3];
        //Student tom = new Student("Tom", 25, 4.85);
        //Student nick =
        //Student jack = new Student("Jack", 21,4.00);
        students[0] = new Student("Tom", 25, 4.85);
        students[1] = new Student("Nick",23, 3.91);
        students[2] = new Student("Nick",23, 3.91);

       // Group gr=new Group("first", tom, nick, jack);
        Group gr=new Group(1103, students);
        gr.getInfo();

    }
}
