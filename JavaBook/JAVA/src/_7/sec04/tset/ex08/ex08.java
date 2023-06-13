package _7.sec04.tset.ex08;

class A {
    int a, b, c, d;
    A() {
        this(5);
    }
    A(int k) {
        a = k;
        b = k;
        c = k;
        d = k;
    }

}
public class ex08 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}
