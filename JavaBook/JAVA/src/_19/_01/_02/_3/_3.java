package _19._01._02._3;

import java.nio.charset.Charset;

public class _3 {
    public static void main(String[] args) {
        Charset cs1 = Charset.defaultCharset();
        Charset cs2 = Charset.forName("MS949");
        Charset cs3 = Charset.forName("UTF-8");
        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs3);
        System.out.println();
        System.out.println(Charset.isSupported("MS949"));
        System.out.println(Charset.isSupported("UTF-8"));
    }
}
