package _19._02._09._3;

import java.io.*;

public class _3 {
    public static void main(String[] args) throws IOException{

        File dataFile = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\_02\\_09\\_3\\file.txt");

        try(OutputStream os = new FileOutputStream(dataFile);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);) {
            dos.writeInt(35);
            dos.writeDouble(5.8);
            dos.writeChar('A');
            dos.writeUTF("안녕하세요");
            dos.flush();
        }

        try(InputStream is = new FileInputStream(dataFile);
            BufferedInputStream bis = new BufferedInputStream(is);
            DataInputStream dis = new DataInputStream(bis);) {
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());
        }
    }
}
