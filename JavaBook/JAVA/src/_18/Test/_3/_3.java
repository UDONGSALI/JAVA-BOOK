package _18.Test._3;

interface A{
    double bcd(int k);
}
class B{
    double bcd(int k){
        return k * 0.1;
    }
}
public class _3 {
    public static void main(String[] args) {

        B b = new B();

        A a = (k) -> {
            return b.bcd(k);
        };

        A a2 = b::bcd;

    }
}
