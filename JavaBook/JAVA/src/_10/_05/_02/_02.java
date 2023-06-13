package _10._05._02;
class A {
    A(){
        this(3);
        System.out.println("A 생성자 1");
    }
    A(int a){
        System.out.println("A 생성자 2");
    }
}
class B extends A{
    B(){
        this(3);
        System.out.println("B 생성자 1");
    }
    B(int a){
        System.out.println("B 생성자 2");
    }
}
public class _02 {
    public static void main(String[] args) {

        A aa = new A();
        System.out.println();
        A a2 = new A(3);
        System.out.println();

        B bb = new B();
        System.out.println();
        B b2 = new B(3);
        System.out.println();


    }
}
