package _19._02._09._2;

import java.io.*;

public class _2 {
    public static void main(String[] args) throws IOException{

        File dataFile = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\_02\\_09\\_2\\file.txt");

        try(OutputStream os = new FileOutputStream(dataFile);
            DataOutputStream dos = new DataOutputStream(os);) {
            dos.writeInt(35);
            dos.writeDouble(5.8);
            dos.writeChar('A');
            dos.writeUTF("안녕하세요");
            dos.flush();
        }

        try(InputStream is = new FileInputStream(dataFile);
            DataInputStream dis = new DataInputStream(is);) {
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());


        }

    }
}
