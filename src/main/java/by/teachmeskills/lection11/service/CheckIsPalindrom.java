package by.teachmeskills.lection11.service;

public class CheckIsPalindrom {

    public boolean chkPldr(String line) {
        boolean check = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(line.length() - i - 1)) {
                check = true;

            } else {
                check = false;
                // System.out.println(line + " Is not palindrom");
                break;
            }
        }
        if (check) {
            System.out.println(line + " Is Palindrom");
        }
        return check;
    }
}
