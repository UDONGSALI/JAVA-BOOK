package _7.sec04.ex02;

class A {
    int m;
    int n;

    void inti(int m, int n) {
        m = m;
        n = n;
    }

}

class B {
    int m;
    int n;

    void inti(int m, int n) {
        this.m = m;
        this.n = n;
    }
}

public class ex02 {
    public static void main(String[] args) {
        //필드명과 지역 변수명이 같고 디스 키워드를 사용하지 않음
        A a = new A();
        a.inti(2, 3);
        System.out.println(a.m);
        System.out.println(a.n);


        B b = new B();
        b.inti(2, 3);
        System.out.println(b.m);
        System.out.println(b.n);
    }
}
