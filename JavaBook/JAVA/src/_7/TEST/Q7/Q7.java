package _7.TEST.Q7;

class A {
    int m = 3;
    int n = 5;
    void abc(int m, int n) {
       m = m;
       n = n;
    }
}
public class Q7 {
    public static void main(String[] args) {
        A a = new A();
        a.abc(7, 8);
        System.out.println(a.m);
        System.out.println(a.n);
    }
}
