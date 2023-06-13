package _13.Test._04;

class A{
    static class B{
        void bcd(){
            System.out.println("정적 이너 클래스의 메서드");
        }
    }
}

public class _04 {
    public static void main(String[] args) {
        A.B ab = new A.B();
        ab.bcd();


    }
}
