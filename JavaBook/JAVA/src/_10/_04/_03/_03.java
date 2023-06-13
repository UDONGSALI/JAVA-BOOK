package _10._04._03;

class A {
    static void print() {
        System.out.println("A 클래스");
    }
}

class B extends A{
    static void print() {
        System.out.println("B 클래스");
    }
}

public class _03 {
    public static void main(String[] args) {
        //클래스명으로 바로 접근
        A.print();
        B.print();
        System.out.println();

        //객체 생성
        A aa = new A();
        B bb = new B();
        A ab = new B();

        aa.print();
        bb.print();
        ab.print();

    }
}
