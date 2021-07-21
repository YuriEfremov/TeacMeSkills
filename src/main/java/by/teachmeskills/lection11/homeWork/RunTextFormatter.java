package by.teachmeskills.lection11.homeWork;

import java.io.*;

public class RunTextFormatter {
    public static void main(String[] args) throws IOException {

        String snt = new String(" ");
        StringBuilder sent = new StringBuilder(snt);
        String sntc;
        TextFormatter txtf = new TextFormatter();
        try (BufferedReader fl_read = new BufferedReader(new FileReader("d:/bigtext.txt"));
             FileWriter fl_write = new FileWriter("d:/newbigtext.txt")) {
            while ((sntc = fl_read.readLine()) != null) {
                if (txtf.getWordsInString(sntc)) {
                    fl_write.write(sntc.concat("\n"));


                }


            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}

