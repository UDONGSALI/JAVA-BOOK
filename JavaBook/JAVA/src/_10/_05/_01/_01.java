package _10._05._01;

class A{
    A(){
        System.out.println("A 생성자");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("B 생성자");
    }
}

class C{
    C(int c){
        System.out.println("C 생성자");
    }
}
class D extends C{
    D(){
//        super();
        super(3);
        System.out.println("D 생성자");
    }
}
public class _01 {
    public static void main(String[] args) {

        A aa = new A();
        System.out.println();

        B bb = new B();
    }
}
