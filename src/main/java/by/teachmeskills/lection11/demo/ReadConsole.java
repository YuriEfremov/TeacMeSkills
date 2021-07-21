package by.teachmeskills.lection11.demo;
//truing to work with BufferReader/Writer FileReader/Writer

import java.io.*;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader inpStr = new InputStreamReader(System.in);
             BufferedWriter bf_wr = new BufferedWriter(new FileWriter("consinp.txt", true));
             FileWriter flWr = new FileWriter("probeforbuffer.txt");
             BufferedWriter bf_wr1 = new BufferedWriter(flWr)) {

            System.out.println("Input text, if end - input \"q\"");
                 char a;
            do
                 {
                     a = (char) inpStr.read();
                     bf_wr.write(a);
                     bf_wr1.write(a);
                     System.out.print(a);
                 } while(a !='q');
             }catch(IOException excp) {
            System.out.println(excp.getMessage());
        }

    }
}
