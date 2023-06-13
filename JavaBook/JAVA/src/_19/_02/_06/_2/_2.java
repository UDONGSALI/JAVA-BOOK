package _19._02._06._2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _2 {
    public static void main(String[] args) throws IOException {

        //입력 파일 생성
        File outFile = new File("C:/Users/BIG601-02/IdeaProjects/_10/src/_19/_02/_05/_1/outFile1.txt");
//        2 n-byte 단위 쓰기
        OutputStream os2 = new FileOutputStream(outFile);
        byte[] bytarr1 = "안녕하세요".getBytes();
        os2.write(bytarr1);
        os2.write('\n');
        os2.flush();
        os2.close();
//        //3 n-byte 단위 쓰기
        OutputStream os3 = new FileOutputStream(outFile, true);
        byte[] bytarr2 = "반갑습니다".getBytes();
        os3.write(bytarr2,6,6);
        os3.write('\n');
        os3.flush();
        os3.close();
    }
}
