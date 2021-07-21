package by.teachmeskills.lection6.inClass1.studentFromVova;

public class Group {
    private String name;
    private Student [] students;

    public Group(String name, Student... students) {
        this.name = name;
        this.students = students;
    }

    public void getInfoStudents() {
        System.out.println("Группа : "+name);
        for (Student student : students) {
            System.out.print(student.getInfo()+"\n");
            System.out.println();
        }
    }
}
