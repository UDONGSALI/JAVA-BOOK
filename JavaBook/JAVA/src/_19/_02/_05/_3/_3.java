package _19._02._05._3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class _3 {
    public static void main(String[] args) throws IOException {

        //Input stream 객체 생성
        File inFile = new File("C:/Users/BIG601-02/IdeaProjects/_10/src/_19/_02/_05/_1/FileINput.txt");
        //n-byte 단위 읽기

        InputStream is2 = new FileInputStream(inFile);
        byte[] bytarr1 =new byte[9];
        int cnt1;
        while ((cnt1=is2.read(bytarr1)) != -1){
            String str = new String(bytarr1,0,cnt1,Charset.forName("UTF-8"));
            System.out.print(str);
            System.out.println(" : count = " + cnt1);
        }
        is2.close();
        System.out.println();
        System.out.println();

        InputStream is3 = new FileInputStream(inFile);
        byte[] bytarr2 =new byte[9];
        int offset = 3;
        int length = 6;
        int cnt2 = is3.read(bytarr2,offset,length);
        String str2 = new String(bytarr2,0,offset+ cnt2,Charset.defaultCharset());
        System.out.println(str2);
        is3.close();




    }
}
