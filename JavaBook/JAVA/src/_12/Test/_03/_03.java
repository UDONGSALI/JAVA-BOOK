package _12.Test._03;

abstract class A{
    abstract void abc();
}

public class _03 {
    public static void main(String[] args) {
        A a =new A() {
            @Override
            void abc() {
                System.out.println("반갑습니다");
            }
        };
        a.abc();
    }
}
