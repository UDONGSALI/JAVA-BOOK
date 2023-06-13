package _12._02._01;

abstract  class  A{
    abstract void abc();
}
class B extends A{
    @Override
    void abc() {
        System.out.println("자식 클래스 생성 및 추상 메서드 구현");
    }
}

public class _01 {
    public static void main(String[] args) {
        //객체 생성
        A b1 = new B();
        A b2 = new B();

        b1.abc();
        b2.abc();

    }
}
