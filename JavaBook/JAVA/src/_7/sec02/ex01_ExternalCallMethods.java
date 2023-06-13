package _7.sec02;

class A{
    void print(){
        System.out.println("안녕");
    }
    int data(){
        return 3;
    }
    double sum(int a, double b){
        return  a+b;
    }
    void printMonth(int m){
        if (m<0||m>12){
            System.out.println("잘못된 입력입니다");
            return;
        }
        System.out.println(m + "월 입니다.");
    }
}

public class ex01_ExternalCallMethods {
    public static void main(String[] args) {

        A a = new A();

        a.print();

        int k  = a.data();
        System.out.println(k);

        double result = a.sum(5, 3.5);
        System.out.println(result);
        a.printMonth(3);
        a.printMonth(15);


    }
}
