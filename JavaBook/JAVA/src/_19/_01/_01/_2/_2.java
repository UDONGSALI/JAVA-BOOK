package _19._01._01._2;

import java.io.File;

public class _2 {
    public static void main(String[] args) {
        //C드라이브 내에 temp 폴더가 없을시에 생성
        File tempDir = new File("C/temp");
        if (!tempDir.exists()) tempDir.mkdir();

        //1.파일 객체 생성
        File file = new File("C:/widows");
        //2.파일 메서드
        System.out.println("절대 경로 : "  +file.getAbsolutePath());
        System.out.println("폴?더 : "  +file.isDirectory());
        System.out.println(" 파 ?일 : "  +file.isFile());
        System.out.println("폴더/파일명 : "  +file.getName());
        System.out.println("부모 폴더 : "  +file.getParent());
        File newfile1 = new File("C:/temp/abc");
        System.out.println(newfile1.mkdir());
        File newfile2 = new File("C:/temp/abc/bcd/cde");
        System.out.println(newfile2.mkdir());
        System.out.println(newfile2.mkdirs());
        File[] fanames = file.listFiles();

        for (File fname: fanames) {
            System.out.println((fname.isDirectory()? "폴더 : " : "파일 : ") + fname.getName());
        }
    }
}
