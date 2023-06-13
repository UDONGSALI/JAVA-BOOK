package _19._02._09._1;

import java.io.*;

public class _01 {
    public static void main(String[] args) {

        File orgFile = new File("D:/html/imgs/w4.jpg");
        File copyFile1 = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\_02\\bw\\copy1.jpg");
        File copyFile2 = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\_02\\bw\\copy2.jpg");

        long start, end, time1, time2;
        //1.BufferedInputStream, BufferedOutputStream을 사용하지 않을 때
        start = System.nanoTime();
        try {
            InputStream is = new FileInputStream(orgFile);
            OutputStream os = new FileOutputStream(copyFile1);
            //복사하는 코드
            int data;
            while ((data = is.read())!= -1){
                os.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.nanoTime();
        time1 = end - start;
        System.out.println(time1);

        start = System.nanoTime();
        try {
            InputStream is = new FileInputStream(orgFile);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(copyFile2);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            //복사하는 코드
            int data;
            while ((data = bis.read())!= -1){
                bos.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.nanoTime();
        time2 = end - start;
        System.out.println(time2);

        System.out.println(time1/time2);


    }
}
