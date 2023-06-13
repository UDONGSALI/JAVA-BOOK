package _18._01._01;

interface A {
    void abc();
}

class  B implements A{
    @Override
    public void abc() {
        System.out.println("구현 클래스");
    }
}

public class _01 {
    public static void main(String[] args) {
        A a = new B();
        a.abc();

        A b = new A() {
            @Override
            public void abc() {
                System.out.println("익명 이너 클래스");
            }
        };
        b.abc();

        A c = () -> System.out.println("람다식");
        c.abc();
    }
}
