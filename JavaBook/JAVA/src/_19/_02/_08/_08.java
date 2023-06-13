package _19._02._08;

import java.io.IOException;
import java.io.OutputStream;

public class _08 {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        //n-byte 단위 쓰기
        byte[] bytearr = "안녕하세요".getBytes();
        os.write(bytearr);
        os.write('\n');
        os.flush();
        //n-byte 단위 쓰기
        byte[] bytearr2 = "반갑습니다.".getBytes();
        os.write(bytearr2, 6, 6);
        os.write('\n');
        os.flush();

    }
}
