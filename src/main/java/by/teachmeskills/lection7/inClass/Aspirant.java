package by.teachmeskills.lection7.inClass;

public class Aspirant extends Student{
    String work;

   // public Aspirant(String work) {
       // this.work = work;
   // }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public int getScholarship(){
        if (averageMark==5){
            return 200;
        }
        else {return 180;}
    }
@Override
    public void getDisplay(){
        System.out.printf("Name: %s\t Lastname: %s\t Group: %s\t Average Mark: %.2f\t Science work: %s\n ", firstName, lastName, group,averageMark, work);
    }
   // public void setWork(String work) {
     //   this.work = work;
  //  }

}
