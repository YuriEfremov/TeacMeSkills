package by.teachmeskills.lection7.inClass;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (averageMark==5){
            return 100;
        }
        else {return 80;}
    }
    public void getDisplay(){
        System.out.printf("Name %s\t Lastname %s\t Group %s\t Average Mark %.2f\n", firstName, lastName, group,averageMark);
    }

   // @Override
   // public String toString() {
      ///  return "Student{" +
          //      "firstName='" + firstName + '\'' +
          //      ", lastName='" + lastName + '\'' +
          //      ", group='" + group + '\'' +
          //      ", averageMark=" + averageMark +
         //       '}';
  //  }
}
