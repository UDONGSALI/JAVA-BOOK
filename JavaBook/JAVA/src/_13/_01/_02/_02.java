package _13._01._02;

class A{
    int a = 3;
    static int b = 4;
    void method1(){
        System.out.println("instance method1");
    }
    static  void method2(){
        System.out.println("instance method2");
    }

    static class B{
        void bcd(){
//            System.out.println(a);
            System.out.println(b);

//            method1();
            method2();
        }
    }
}


public class _02 {
    public static void main(String[] args) {
        A.B b =new  A.B();
        b.bcd();
    }
}
