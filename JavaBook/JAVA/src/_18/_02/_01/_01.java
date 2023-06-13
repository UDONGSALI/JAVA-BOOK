package _18._02._01;

interface A {
    void method1();
}
interface B {
    void method2(int a);
}
interface C {
    int method3();
}
interface D {
    double method4(int a, double b);
}

public class _01 {
    public static void main(String[] args) {

        A a1 = new A() {
            @Override
            public void method1() {
                System.out.println("입력 X 리턴 X");
            }
        };

        A a2  = () -> {
            System.out.println("입력 X 리턴 X");
        };
        A a3  = () ->System.out.println("입력 X 리턴 X");


        B b1  = new B() {
            @Override
            public void method2(int a) {
                System.out.println("입력 X 리턴 X");
            }
        };

        B b2 =  (int a) -> {
            System.out.println("입력 X 리턴 X");
        };

        B b3 =  (a) -> {
            System.out.println("입력 X 리턴 X");
        };

        B b4 =  (a) -> System.out.println("입력 X 리턴 X");

        B b5 =  a -> System.out.println("입력 X 리턴 X");

        C c1 = new C() {
            @Override
            public int method3() {
                return 4;
            }
        };

        C c2 = () -> {
            return 4;
        };

        C c3 = () -> 4;


        D d1 = new D() {
            @Override
            public double method4(int a, double b) {
                return  a + b ;
            }
        };

        D d2 = (int a , double b) -> {
            return  a + b ;
        };

        D d3 = (a, b) -> {
            return  a + b ;
        };
        D d4 = (a, b) -> a + b;


    }
}
