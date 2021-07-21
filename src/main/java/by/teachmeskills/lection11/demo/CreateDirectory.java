package by.teachmeskills.lection11.demo;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Arrays;

public class CreateDirectory {
    public static void main(String[] args) {
        String nameDir = "d:/efr";
        File fdr = new File(nameDir);
        //fdr.mkdirs();
        String [] s =fdr.list();
        for(String path : s){
            System.out.println(path);
        }
        //System.out.println(Arrays.toString(s));
    }
}
