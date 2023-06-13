package _19._02._05._2;

import java.io.*;

public class _2 {
    public static void main(String[] args) throws IOException {

        //Input stream 객체 생성
        File inFile = new File("C:/Users/BIG601-02/IdeaProjects/_10/src/_19/_02/_05/_1/FileINput.txt");
        //1-1 byte 단위 읽기
        InputStream is1 = new FileInputStream(inFile);
        int data;
        while ((data=is1.read()) != -1){
            System.out.print((char)data);
        }
        is1.close();
        System.out.println();
        System.out.println();

        InputStream is2 = new FileInputStream(inFile);
        byte[] bytarr1 =new byte[9];
        int cnt1;
        while ((cnt1=is2.read(bytarr1)) != -1){
            for (int i = 0; i < cnt1; i++) {
                System.out.print((char)bytarr1[i]);
            }
            System.out.println(" : cnt1 = " + cnt1);
        }
        is2.close();
        System.out.println();
        System.out.println();

        InputStream is3 = new FileInputStream(inFile);
        byte[] bytarr2 =new byte[9];
        int offset = 3;
        int length = 6;
        int cnt2 = is3.read(bytarr2,offset,length);
        for (int i = 0; i < offset + cnt2; i++) {
            System.out.print((char)bytarr2[i]);
        }
        is3.close();




    }
}
