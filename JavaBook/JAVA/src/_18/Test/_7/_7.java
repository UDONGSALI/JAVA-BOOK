package _18.Test._7;

interface A {
    void abc(B b, int k);
}
class B{
    void bcd(int k){
        System.out.println(k);
    }
}

public class _7 {
    public static void main(String[] args) {

        A a = B::bcd;
        B b  = new B();
        a.abc(b , 3);

    }
}
