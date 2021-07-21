package by.teachmeskills.lection6.inClass1;

public class Group {
    private int num;
    //private String name;
    private Student[] students;

    //public Group(int num, Student... students) {
    public Group(int num, Student[] students) {
        this.num = num;
        this.students = students;
    }

    public void getInfo() {
        System.out.println("Group № " + num);
        for (Student i : students) {
            System.out.print(i.printInfoStudent());
            System.out.println();
        }

    }
}

