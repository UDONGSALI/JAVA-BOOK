package _7.sec04.tset.ex02;

class A{

    void print(){
        System.out.println("입력값이 없습니다.");
    }
    void print(int a){
        System.out.println("정수 입력값 : " + a);
    }
    void print(double b){
        System.out.println("실수 입력값 : " + b);
    }
    void print(String c){
        System.out.println("문자열 입력값 : " +c);
    }
}

public class ex02 {

    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.print(3);
        a.print(5.2);
        a.print("안녕");

    }
}
