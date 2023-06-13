package _7.sec03;

class Aa {
    public static void main(String[] args) {
//        System.out.println(st(1));

    }
    static void st (int a){
        int b = a =+ 2;
        System.out.println(b);
    }
    Aa(){
        System.out.println("첫번째 생성자");
    }
    Aa(int a){
        System.out.println("두번째 생성자");
    }
    Aa(int a, int b){
        System.out.println("세번째 생성자");
    }
}

public class ex02_ConstructorOverloading {
    public static void main(String[] args) {
        Aa a1 = new Aa();
//        int c = a1;

    }
}
