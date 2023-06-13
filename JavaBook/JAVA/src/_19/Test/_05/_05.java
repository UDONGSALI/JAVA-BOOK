package _19.Test._05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class _05 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] a = "안녕하세요".getBytes("UTF-8");
        String b = new String(a, 6, 9);

        System.out.println(b);

    }
}
