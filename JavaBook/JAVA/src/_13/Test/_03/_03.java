package _13.Test._03;

class A{
    void print(){
        System.out.println("클래스 A 메서드");
    }
    class B {
        void print(){
            System.out.println("클래스 B 메서드");
        }
        void bcd(){
             A.this.print();

        }
    }
}


public class _03 {
    public static void main(String[] args) {
        A a = new A();
        A.B b  = a.new B();

        b.bcd();
    }
}
