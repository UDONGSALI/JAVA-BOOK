package _19._02._07._1;

import java.io.IOException;
import java.io.InputStream;

public class _1 {
    public static void main(String[] args) throws IOException {
        //InputStream 객체 생성
        InputStream is = System.in;
        int data;
        while ((data = is.read()) != '\n'){
            System.out.println("읽은 데이터 : " + (char)data + "남은 바이트 수 : " + is.available());
        }
        System.out.println(data);
        System.out.println(is.read());
    }
}
