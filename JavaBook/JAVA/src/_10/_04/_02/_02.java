package _10._04._02;

class A{
    static int m = 3;
}
class B extends A{
    static int m = 4;
}
public class _02 {
    public static void main(String[] args) {
        //클래스 명으로 바로 접근
        System.out.println(A.m);
        System.out.println(B.m);

        A aa = new A();
        B bb = new B();
        A ab = new B();

        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);

    }
}
