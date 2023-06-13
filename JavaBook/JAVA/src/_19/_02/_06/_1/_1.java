package _19._02._06._1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _1 {
    public static void main(String[] args) throws IOException {

        //입력 파일 생성
        File outFile = new File("C:/Users/BIG601-02/IdeaProjects/_10/src/_19/_02/_05/_1/outFile1.txt");
        //1-1 byte 단위 쓰기
        OutputStream os1 = new FileOutputStream(outFile);
        os1.write('j');
        os1.write('a');
        os1.write('v');
        os1.write('a');
        os1.write('\r');
        os1.write('\n');
        os1.flush();
        os1.close();
//        2 n-byte 단위 쓰기
        OutputStream os2 = new FileOutputStream(outFile, true);
        byte[] bytarr = "hello".getBytes();
        os2.write(bytarr);
        os2.write('\n');
        os2.flush();
        os2.close();
//        //3 n-byte 단위 쓰기
        OutputStream os3 = new FileOutputStream(outFile, true);
        byte[] bytarr2 = "Better the last smail".getBytes();
        os3.write(bytarr2,7,8);
        os3.write('\n');
        os3.flush();
        os3.close();
    }
}
