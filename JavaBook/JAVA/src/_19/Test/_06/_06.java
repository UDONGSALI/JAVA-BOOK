package _19.Test._06;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class _06 {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        byte[] ar = "반가워".getBytes();

        os.write(ar);
        os.flush();
    }
}
