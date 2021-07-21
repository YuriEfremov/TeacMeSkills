package by.teachmeskills.lection11.service;

import java.io.*;
//import by.teachmeskills.lection11.service.CheckIsPalindrom;
public class FileHandler {
    public void readFile(String filename) throws IOException {
        String result;
        int a = 0;
        String line;
        int check = 0;

        CheckIsPalindrom chk = new CheckIsPalindrom();
        try (BufferedReader bf_reader = new BufferedReader(new FileReader(filename));
             FileWriter fl = new FileWriter("d:/palindrom.txt", true)) {

            while ((line = bf_reader.readLine()) != null) {

                if (chk.chkPldr(line)){
                        fl.write(line.concat("\n"));
                        System.out.println(line);
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

}

