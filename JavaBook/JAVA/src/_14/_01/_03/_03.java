package _14._01._03;

import java.io.IOException;
import java.io.InputStreamReader;

class A implements Cloneable{
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class _03 {
    public static void main(String[] args){
        //일반 예외

        //1. InterruptedException
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2. ClassNotFoundException
        try {
            Class cls = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //3. IOEXception
        InputStreamReader in = new InputStreamReader(System.in);
        try {
            in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //4.FileNOtSupppetedExcetion
        A a1 = new A();
        try {
            A a2 = (A)a1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
