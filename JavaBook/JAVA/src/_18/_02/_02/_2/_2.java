package _18._02._02._2;

interface A {
    void abc(int k);
}

public class _2 {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void abc(int k) {
                System.out.println(k);
            }
        };

        A a2 = (int k) -> {
            System.out.println(k);
        };

        A a3 = System.out::println;
        a1.abc(1);
        a2.abc(2);
        a3.abc(3);
    }
}
