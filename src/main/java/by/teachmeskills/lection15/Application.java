package by.teachmeskills.lection15;


import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Job programmer = new Job("Programmer", 1000);
        Job teacher = new Job("Teacher", 500);
        Job doctor = new Job("Doctor", 500);
        Job driver = new Job("Driver", 600);

        Employee employee1 = new Employee("Vasya", 40, Set.of(driver));
        Employee employee2 = new Employee("Nick", 45, Set.of(teacher));
        Employee employee3 = new Employee("Tanya", 30, Set.of(doctor,teacher));
        Employee employee4 = new Employee("John", 20, Set.of(programmer,doctor));
        Employee employee5 = new Employee("John", 25, Set.of(teacher));
        Employee employee6 = new Employee("Peter", 55, Set.of(driver));
        Employee employee7 = new Employee("Frank", 40, Set.of(teacher));
        Employee employee8 = new Employee("Katya", 34, Set.of(doctor));
        Employee employee9 = new Employee("Yuri", 19, Set.of(programmer,teacher,doctor));
        Employee employee10 = new Employee("Katya", 46, Set.of(teacher));

//посчитать работников старше 30
        List<Employee> employeeList = List.of(employee1, employee2, employee3, employee4, employee5,
                employee6, employee7, employee8, employee9, employee10);
        //System.out.println(employee4.getJob().size());
        //    long numAge30 = employeeList.stream().filter(i -> i.getAge() > 30).count();
        //     System.out.println(numAge30);

        //вывести всех сотрудников с буквами v или t в имени
        // employeeList.stream()
        //        .filter(n -> (n.getName().toLowerCase().contains("v") || n.getName().toLowerCase().contains("t")))
        //          .forEach(p -> System.out.println(p));

        //вывести уникальные имена в сортированном виде
        //  employeeList.stream()
        //        .map(Employee::getName)
        //         .distinct() // не, ну емае, ну как можно было забыть такое
        //        .sorted()
        //           .forEach(p -> System.out.println(p));


//Вывести сотрудников, у кого больше 2 работ
       // List<Employee> employees = employeeList.stream().filter(jb -> jb.getJob().size() > 1).collect(Collectors.toList());  .. можно и так
       // employees.forEach(System.out::println);

     //   employeeList.stream().filter(jb -> jb.getJob().size() > 1).forEach(System.out::println);

//отсортировать сотрудников по имени
    //    employeeList.stream().sorted(Comparator.comparing(nm->nm.getName())).forEach(System.out::println);

        // отсортировать по количеству работ и вывести сотрудников
        employeeList.stream()
                .sorted(Comparator.comparing(nm->nm.getJob().size()))
                .forEach(prn-> System.out.printf("Сотрудник %s работает на %d работах\n", prn.getName(), prn.getJob().size()));
        //List<Employee> emp = employeeList.stream()
        //                .sorted(Comparator.comparing(nm->nm.getJob().size()))
        //                .collect(Collectors.toList());
        //Collections.reverse(emp); //хочу в обратном порядке
        // System.out.println(emp);

       IntSummaryStatistics statistics= employeeList.stream()
               .map(Employee->Employee.getJob())
              .flatMap(Collection::stream)
               .mapToInt(Job-> Job.getSalary())
               .summaryStatistics();

        System.out.printf("Stat\n %d max\n %d Min\n %f Average\n %d Sum\n",
                statistics.getMin(),
                statistics.getMax(),
                statistics.getAverage(),
                statistics.getSum());


        int [] slr = employeeList.stream().map(Employee::getJob).flatMap(Collection::stream).mapToInt(Job::getSalary).toArray();
        //int [] slr = employeeList.stream().flatMap(g->g.getJob().stream()).mapToInt(m->m.getSalary()).toArray();
        int sm=0;
        for (int i:slr)
        {
         sm=sm+i;
        }
        double ave=(double) sm/slr.length;
        Arrays.sort(slr);
        System.out.printf("Average Salary = %f\n Max Salary= %d\n Min Salary = %d\n",ave, slr[0], slr[slr.length-1]);

    }
}
