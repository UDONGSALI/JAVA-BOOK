package _13.Test._08;

class A{
    interface B{
        static void bcd(){
            System.out.println("이너 인터페이스 내 static 메서드");
        }
    }
}
public class _08 {
    public static void main(String[] args) {
        A.B.bcd();
    }
}
