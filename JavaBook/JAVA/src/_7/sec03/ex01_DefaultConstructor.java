package _7.sec03;

class A{
    int m;
    void work(){
        System.out.println(m);
    }



}
class B{
    int m;
    void work(){
        System.out.println(m);
    }
    B(){

    }


}
class C{
    int m;
    void work(){
        System.out.println(m);
    }
C(int a){
    m=a;
}
}

public class ex01_DefaultConstructor {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
//        C c = new C();
        C c = new C(3);

        a.work();
        b.work();
        c.work();
    }
}
