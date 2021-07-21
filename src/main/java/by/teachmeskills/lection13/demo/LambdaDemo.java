package by.teachmeskills.lection13.demo;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {

    static FuncInt fint = new FuncInt() {  //why static?? - through anonymous class
        @Override
        public void prnA() {
            System.out.println("Probe Func");
        }
    };

    public static void main(String[] args) {
        fint.prnA(); //Through anonymous class
        FuncInt ff= () ->System.out.println("Probe lambda");  //through Lambda е принимает значений
        ff.prnA();
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(-3));
    }

}


