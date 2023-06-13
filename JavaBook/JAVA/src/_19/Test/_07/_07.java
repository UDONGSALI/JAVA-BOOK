package _19.Test._07;

import java.io.*;

public class _07 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\Test\\_07\\file1.txt");

        FileOutputStream os = new FileOutputStream(file);
        BufferedOutputStream bs = new BufferedOutputStream(os);
        DataOutputStream ds = new DataOutputStream(bs);

    }
}
