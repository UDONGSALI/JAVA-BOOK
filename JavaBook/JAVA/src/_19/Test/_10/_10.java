package _19.Test._10;

import java.io.*;

public class _10 {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);

        int data;
        while ((data = reader.read()) != '\r' ){
            System.out.print((char)data);
        }
    }
}
