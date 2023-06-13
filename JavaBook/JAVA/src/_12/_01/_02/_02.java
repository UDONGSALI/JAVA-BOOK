package _12._01._02;

abstract  class  A{
    abstract void abc();
}
public class _02 {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        };
        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        };

        a1.abc();
        a1.abc();
    }
}
