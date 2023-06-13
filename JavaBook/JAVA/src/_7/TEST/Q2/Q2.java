package _7.TEST.Q2;
class A {
    int a;
    double b;
    String c;

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
        System.out.println("문자열 입력값 : " + c);
    }
}
public class Q2 {
    public static void main(String[] args) {
        A a = new A();
        a.print(1);
        a.print(5.3);
        a.print("안녕");
    }
}
