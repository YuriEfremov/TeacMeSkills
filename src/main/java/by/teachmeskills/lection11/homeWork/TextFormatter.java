package by.teachmeskills.lection11.homeWork;

import by.teachmeskills.lection11.service.CheckIsPalindrom;

public class TextFormatter {
    private String inpStr;
    private boolean check;
    CheckIsPalindrom cp = new CheckIsPalindrom();

    public boolean getWordsInString(String sentence) {
        check = false;
        inpStr = sentence.toLowerCase();
        int count = 0;
        int count_w = 0;
        for (int i = 0; i < inpStr.length(); i++) {
            if (inpStr.charAt(i) == ' ') {
                count++;
                if ((i - count_w) > 2) {
                    if (check = cp.chkPldr(inpStr.substring(count_w, i))) {
                        check = true;
                        break;
                    }
                    // for (int j = count_w; j < (i - count_w - 1); j++) {
                    //  if (inpStr.charAt(j) == inpStr.charAt((i - count_w) - j - 1)) {
                    //    check = true;
                    //} else {
                    //  check = false;
                    //System.out.println(" Is not palindrom");
                    //   break;
                    //  }
                    // }
                }
                count_w = i;
            }
        }
        switch (count) {
            case 2, 3, 4:
                check = true;
                break;
            default:
                break;
        }
        return check;
    }
}
