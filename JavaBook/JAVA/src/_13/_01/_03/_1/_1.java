package _13._01._03._1;

class A{
    int a = 3;
    void abc(){
        int b = 5;
        class B{
            void bcd(){

                System.out.println(a);
                System.out.println(b);
                a = 5;
//                b = 7;
            }
        }
        B bb = new B();
        bb.bcd();
    }
}

public class _1 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
    }
}
