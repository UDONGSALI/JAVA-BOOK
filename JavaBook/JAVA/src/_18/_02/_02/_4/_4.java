package _18._02._02._4;

interface A {
    void abc(B b, int k);
}
class B{
    void bcd(int k){
        System.out.println(k);
    }
}

public class _4 {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void abc(B b, int k) {
                b.bcd(k);
            }
        };

        A a2 = (B b, int k) -> {
            b.bcd(k);
        };

        A a3 = B::bcd;
        a1.abc(new B(), 3);
        a2.abc(new B(), 3);
        a3.abc(new B(), 3);
    }
}
