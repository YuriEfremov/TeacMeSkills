package by.teachmeskills.lection7.inClass;

public class Run {
    public static void main(String[] args) {
        Student stdnt = new Student();
        Student asp1 = new Aspirant("Petr", "Ivanov", "aspirants", 5, "SomethingAboutScience");
        stdnt.firstName = "Nick";
        stdnt.lastName = "Jhonson";
        stdnt.group = "First Group";
        stdnt.averageMark = 4.22;
        Student[] students = {stdnt, asp1};
        for (Student n : students) {
            n.getDisplay();
            System.out.println("Money:" + n.getScholarship());
        }

        //System.out.println("Money: " + stdnt.getScholarship());
    }
}
