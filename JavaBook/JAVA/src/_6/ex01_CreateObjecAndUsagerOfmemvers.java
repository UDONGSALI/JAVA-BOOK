package _6;
class A{
    int m = 3;
    void print() {
        System.out.println("객체 생성 및 활용");
    }
}

public class ex01_CreateObjecAndUsagerOfmemvers {
    public static void main(String[] args) {
        //클래스로 객체 생성
        A a = new A();

        //클래스 활용
        //필드 활용
        a.m = 5;
        System.out.println(a.m);

        // 메서드 활용
        a.print();
    }
}
