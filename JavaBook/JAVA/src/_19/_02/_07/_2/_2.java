package _19._02._07._2;

import java.io.IOException;
import java.io.InputStream;

public class _2 {
    public static void main(String[] args) throws IOException {
        //InputStream 객체 생성
        InputStream is = System.in;
        //1byte단위 읽기
        int data;
        while ((data = is.read()) != '\n'){
            System.out.print((char)data);
        }
        is.read();
        System.out.println();
        System.out.println();

        //2. n-byte 단위 읽기
        byte[]  bytarr1 = new byte[100];
        int cnt1 = is.read(bytarr1);
        for (int i = 0; i < cnt1; i++) {
            System.out.print((char)bytarr1[i]);
        }
        System.out.println(" : count = " + cnt1);
        System.out.println();

        //3. n-byte 단위 읽기
        byte[]  bytarr2 = new byte[8];
        int offset = 3;
        int length = 5;
        int cnt2 = is.read(bytarr2,offset,length);
        for (int i = 0; i < offset + cnt2; i++) {
            System.out.print((char)bytarr2[i]);
        }
        System.out.print(" : count = " + cnt2);
        System.out.println();



    }
}
