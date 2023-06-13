package _18._02._02._1;

interface A{
    void abc();
}
class B {
    void bcd(){
        System.out.println("메서드");
    }
}

public class _1 {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void abc() {
                B b = new B();
                b.bcd();
            }
        };

        A a2 = () -> {
            B b = new B();
            b.bcd();
        };

        B b1 = new B();
        A a3 = b1::bcd;

        a1.abc();
        a2.abc();
        a3.abc();
    }
}
