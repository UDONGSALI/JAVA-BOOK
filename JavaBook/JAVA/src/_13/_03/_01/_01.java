package _13._03._01;

class A{
    interface B{
        public abstract void bcd();
    }
}
class C implements A.B{
    public void bcd(){
        System.out.println("이너 인터페이스 구현 클래스 생성");
    }
}

public class _01 {
    public static void main(String[] args) {
        A.B ab = new C();
        C c = new C();
        ab.bcd();
        c.bcd();

        A.B b = new A.B(){
            public void bcd(){
                System.out.println("익명 이너클래스로 객체 생성");
            }
        };
        b.bcd();
    }
}
