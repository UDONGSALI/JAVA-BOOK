package _7.sec04.ex01;
//클래스 내부에서 필드, 메서드에서 앞에 자동으로 붙는 this 키워드

class A {
    int m;
    int n;
    void inti(int a, int b) {
        int c;
        c = 3;
        this.m = a;
        this.n = b;
    }

    void work() {
        this.inti(2, 3);
    }
}

public class ex01 {
    public static void main(String[] args) {
        //클래스 객체 생성
        A a = new A();
        //메서드 호출/필드값 활용
        a.work();
        System.out.println(a.m);
        System.out.println(a.n);
    }

}
