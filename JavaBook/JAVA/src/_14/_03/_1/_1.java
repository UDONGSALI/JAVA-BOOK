package _14._03._1;

import javax.imageio.IIOException;

class A {
    void abc(){
        bcd();
    }
    void bcd(){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){

        }
    }
}
class B {
    void abc() {
        try {
            bcd();
        }
        catch (InterruptedException e) {

        }

    }

    void bcd() throws InterruptedException {
        Thread.sleep(1000);
    }
}
public class _1 {
    public static void main(String[] args) {

    }

}
