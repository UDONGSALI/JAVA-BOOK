package _14.Test._06;

//class A{
//    void  abc(){
//        bcd();
//    }
//    void bcd(){
//        try {
//            Thread.sleep(1000);
//            Class.forName("java.lang.Object");
//        }catch (InterruptedException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//}
class A {
    void abc() {
        try {
            bcd();
        } catch (InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void bcd() throws InterruptedException, ClassNotFoundException {
        Thread.sleep(1000);
        Class.forName("java.lang.Object");
    }
}

public class _06 {
}
