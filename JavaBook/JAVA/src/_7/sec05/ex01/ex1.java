package _7.sec05.ex01;

class A{
    A(){
        System.out.println("첫 번째 생성자");
    }
    A(int a){
        System.out.println("두 번째 생성자");
    }
}

public class ex1 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A(2);
    }
}
