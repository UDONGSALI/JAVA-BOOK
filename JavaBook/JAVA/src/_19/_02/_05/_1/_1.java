package _19._02._05._1;

import java.io.*;

public class _1 {
    public static void main(String[] args) throws IOException {

        File inFile = new File("C:/Users/BIG601-02/IdeaProjects/_10/src/_19/_02/_05/_1/FileINput.txt");
        //In put stream 객체 생성
        InputStream is = new FileInputStream(inFile);
        int data;
        while ((data = is.read()) != -1){
            System.out.println("읽은 데이터 " +(char)data + "남은 바이트 수: " + is.available());
        }
        is.close();
    }
}
