package by.teachmeskills.lection9;
//замена всех символов, совпадающих с символами позиции (0) на символ позиции (3)
public class HomeWork2 {
    public static void main(String[] args) {
        StrChng st = new StrChng();
        String strnew = "Bobkik Dobkik";
        System.out.println(strnew + " " + st.getChng(strnew));
    }
}

class StrChng {
    public String getChng(String str1) {
        str1 = str1.replace(str1.charAt(3), str1.charAt(0));
        return str1;
    }

}
