package by.teachmeskills.lection16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRun {
    public static void main(String[] args) {
        String ipv4P = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        String ipv4M = "192.168.256.16";
        //Pattern ipv4Pattern = Pattern.compile(ipv4P);
        //Pattern.matches(ipv4P,ipv4M);
       // System.out.println(ipv4Pattern);
       // Matcher ipv4Matcher = ipv4Pattern.matcher(ipv4M);
        if (Pattern.matches(ipv4P,ipv4M)){
            System.out.println(ipv4M + " Is correct" );
        }
        else {
            System.out.println(ipv4M+ " Is incorrect");
        }
    }
}
