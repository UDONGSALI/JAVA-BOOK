package _10._06._01;

class A{
    int a = 3;
    int b = 4;
}
class B{
    int a = 3;
    int b = 4;

    public String toString(){
        return "필드값a, b : " + a + ", " + b;
    }
}
public class _06 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.printf(("%x\n"), a.hashCode());
        System.out.println(a);
        System.out.println(b);

    }
}
