package _14._03._3;
// 다중예외 처리

//1. 하위 메서드에 직접 예외 처리를 할 떄
class A{
    void abc(){
        bcd();
    }
    void bcd(){
        try {
            Class cls = Class.forName("java.lang.Object");
            Thread.sleep(1000);
        }
        catch (InterruptedException | ClassNotFoundException e){

        }
    }
}

class B{
    void abc(){
        try {
            bcd();
        }
        catch (InterruptedException | ClassNotFoundException e){

        }
    }
    void bcd() throws InterruptedException, ClassNotFoundException{
        Class cls = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
}
public class _3 {
    public static void main(String[] args) {

    }
}
