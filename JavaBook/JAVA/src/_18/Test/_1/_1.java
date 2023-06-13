package _18.Test._1;

interface A {
    void abc(double k);
}

public class _1 {
    public static void main(String[] args) {

        A a = new A() {
            @Override
            public void abc(double k) {
                System.out.println(k + 0.5);
            }
        };
        a.abc(3.8);

        A a2 = (k) -> {
            System.out.println(k + 0.5);
        };
        a2.abc(3.8);
    }
}
