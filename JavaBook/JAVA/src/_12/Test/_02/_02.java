package _12.Test._02;

abstract class A{
    abstract void abc();
}
class B extends A{
    @Override
    void abc() {
        System.out.println("안녕하세요");
    }
}

public class _02 {
    public static void main(String[] args) {
        A a = new B();
        a.abc();
    }
}
