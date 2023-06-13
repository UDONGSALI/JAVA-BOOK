package _7.sec04.tset.ex06;

class A {
    int m = 3;
    int n = 5;
    void abc(int m, int n) {
        this.m = m;
        this.n = n;
        System.out.println(m);
        System.out.println(n);
    }
}

public class ex06 {
    public static void main(String[] args) {
        A a = new A();
        a.abc(7, 8);
        System.out.println(a.m);
        System.out.println(a.n);
    }

}
