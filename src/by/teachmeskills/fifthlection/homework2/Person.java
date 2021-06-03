package by.teachmeskills.fifthlection.homework2;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
      this.age = age;
    }
    public void talk()
    {
        System.out.printf("%s, %d year, talk: \n", fullName, age);
    }
    public void move()
    {
        System.out.printf("%s, %d year, move: \n", fullName, age);
    }
}
