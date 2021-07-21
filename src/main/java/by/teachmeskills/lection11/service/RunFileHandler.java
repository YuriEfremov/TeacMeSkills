package by.teachmeskills.lection11.service;

import java.io.IOException;

public class RunFileHandler {
    public static void main(String[] args) throws IOException {
        FileHandler chk = new FileHandler();
        chk.readFile("d:/pldr.txt");
    }
}
