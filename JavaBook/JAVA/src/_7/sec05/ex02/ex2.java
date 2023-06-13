package _7.sec05.ex02;

class A {
    int m1, m2, m3, m4;

    A() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    A(int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    A(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print() {
        System.out.print(m1);
        System.out.print(m2);
        System.out.print(m3);
        System.out.println(m4);
    }
}

class B {
    int m1, m2, m3, m4;

    B() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    B(int a) {
        this();
        m1 = a;
    }

    B(int a, int b) {
        this(a);
        m1 = a;
        m2 = b;
    }

    void print() {
        System.out.print(m1);
        System.out.print(m2);
        System.out.print(m3);
        System.out.println(m4);
    }
}

public class ex2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(5);
        A a3 = new A(5, 10);
        a1.print();
        a2.print();
        a3.print();

        B b1 = new B();
        B b2 = new B(5);
        B b3 = new B(5, 10);
        b1.print();
        b2.print();
        b3.print();
    }
}
