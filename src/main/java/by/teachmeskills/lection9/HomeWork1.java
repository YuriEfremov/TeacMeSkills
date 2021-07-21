package by.teachmeskills.lection9;
//вырезать подстроку из строки, начиная с первого вхождения символа (а) до последнего вхождения сивола (b)
public class HomeWork1 {
    public static void main(String[] args) {
        StrCat st = new StrCat();
        System.out.println(st.getCat("Proibe string", 'o', 'i'));
    }
}

class StrCat {
    public String getCat(String str, char a, char b) {
        return str.substring(str.indexOf(a), str.lastIndexOf(b));
    }
}