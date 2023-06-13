package _12._05._1;

interface A{
    void abc();
    default void bcd(){
        System.out.println("A 인터페이스의 bcd");
    }
}
class B implements A{
    @Override
    public void abc() {
        System.out.println("B 인터페이스의 abc");
    }
}
class C implements A{
    @Override
    public void abc() {
        System.out.println("C 인터페이스의 abc");
    }
    public void bcd(){
        System.out.println("C 인터페이스의 bcd");
    }
}

public class _1 {
    public static void main(String[] args) {
        A a1 =new B();
        A a2 =new C();

        a1.abc();
        a1.bcd();
        a2.abc();
        a2.bcd();

    }
}
