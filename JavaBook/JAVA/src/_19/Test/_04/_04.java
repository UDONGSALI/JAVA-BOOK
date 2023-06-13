package _19.Test._04;

import java.io.*;

public class _04 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\Test\\_04\\file1.txt");
        InputStream is = new FileInputStream(file);
        byte[] byteArray = new byte[6];
        int count;
        while ((count = is.read(byteArray)) != -1) {
            System.out.println(count);
        }
    }
}
