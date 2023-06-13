package _19._01._01._1;

import java.io.File;
import java.io.IOException;

public class _1 {
    public static void main(String[] args) throws IOException {

        //1-1 C 드라이브 내에 temp 폴더가 없을 때 생성
        File tempdDir = new File("C:/temp");
        if (!tempdDir.exists()) {
            tempdDir.mkdir();
        }
        System.out.println(tempdDir.exists());
        //1-2 파일 객페 생성
        File newFile = new File("C:/temp/newFile.txt");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        System.out.println(newFile.exists());
        System.out.println();
        //2 파일 구분자

        File newFile2 = new File("C:\\temp\\newFile.txt");
        File newFile3 = new File("C:/temp/newFile.txt");
        File newFile4 = new File("C:" + File.separator + "temp" + File.separator + "newFile.txt");

        System.out.println(newFile2.exists());
        System.out.println(newFile3.exists());
        System.out.println(newFile4.exists());
        System.out.println();

        //3-1 절대 경로
        File newFile5 = new File("C:/temp/abc/newFile.txt");
        File newFile6 = new File("C:/temp/abc/bcd/newFile.txt");
        System.out.println(newFile5.getAbsolutePath());
        System.out.println(newFile6.getAbsolutePath());
        //3-2 상대 경로
        //현재 위치
        System.out.println(System.getProperty("user.dir"));
        File newFile7 = new File("newFile.txt");
        File newFile8 = new File("bcd/newFile.txt");
        System.out.println(newFile7.getAbsolutePath());
        System.out.println(newFile8.getAbsolutePath());
    }
}
