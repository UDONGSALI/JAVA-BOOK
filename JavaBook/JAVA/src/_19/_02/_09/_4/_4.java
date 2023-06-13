package _19._02._09._4;

import javax.imageio.IIOException;
import java.io.*;

public class _4 {
    public static void main(String[] args) throws IOException {

        File outFile1 = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\_02\\_09\\_4\\file1.txt");
        File outFile2 = new File("C:\\Users\\BIG601-02\\IdeaProjects\\_10\\src\\_19\\_02\\_09\\_4\\file2.txt");

        System.out.println(outFile2.getAbsolutePath());

        try(OutputStream os1 = new FileOutputStream(outFile1);
            PrintStream ps = new PrintStream(os1);){
            ps.println(5.8);
            ps.println(3 + "안녕" + 12345);
            ps.printf("%d", 7).printf("%s %f", "안녕",  5.8);
            ps.println();
        }catch (IOException e){}

        try(PrintStream ps = new PrintStream(outFile2);){
            ps.println(5.8);
            ps.println(3 + "안녕" + 12345);
            ps.printf("%d", 7).printf("%s %f", "안녕",  5.8);
            ps.println();
        }catch (IOException e){}

        try(OutputStream os2 = System.out;
        PrintStream ps =new PrintStream(os2)){
            ps.println(5.8);
            ps.println(3 + "안녕" + 12345);
            ps.printf("%d", 7).printf("%s %f", "안녕",  5.8);
            ps.println();
        }catch (IOException e){}



    }
}
