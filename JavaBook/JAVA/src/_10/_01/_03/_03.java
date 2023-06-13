package _10._01._03;

//클래스의 상속 관계
class A{}
class B extends A {}
class C extends B {}
class D extends B {}

public class _03 {
    public static void main(String[] args) {
        //업캐스팅(자동 변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
        A ac = (A) new C(); // c에서 a 업캐스팅
        B bc = (B) new C(); // c에서 b 업캐스팅

        B bb = (B) new B();
        A a = (A) bb;//b에서 a 업캐스팅

        //다운캐스팅 (수동 변환): 캐스팅 할 수 없을 때 (실행할 때 예외 발생)
        A aa = new A();
//        B b = (B) aa;//A에서 B 다운캐스팅 불가능
//        C c = (C) aa;//A에서 B 다운캐스팅 불가능

        A ab = new B();
        B b = (B) ab;//a 에서 b 다운 캐스팅
//        C c = (C) aa; // A 에서 C 다운캐스팅 불가능

        B bd = new D();
        D d = (D) bd; // B 에서 D 다운캐스팅

        A ad = new D();
        B b1 = (B) ad; //A 에서 B 다운캐스팅
        D d1 = (D) ad;// A 에서 D 다운 캐스팅

    }
}
