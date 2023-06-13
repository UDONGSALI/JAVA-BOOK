package _10._01._05;

class A {}
class B extends A {}
public class _05 {
    public static void main(String[] args) {
        //instanceof

        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A);
        System.out.println(ab instanceof A);

        System.out.println(aa instanceof B);
        System.out.println(ab instanceof B);

        if (aa instanceof B){
            B b = (B) aa;
            System.out.println("aa 를 B 로 캐스팅 했습니다.");
        }else {
            System.out.println("aa 는 B 로 캐스팅이 불가능 합니다,");
        }
        if (ab instanceof B){
            B b = (B) ab;
            System.out.println("ab 를 B 로 캐스팅 했습니다.");
        }else {
            System.out.println("ab 는 B 로 캐스팅이 불가능 합니다,");
        }
        if ("안녕"instanceof String){
            System.out.println("\"안녕\"은 String 클래스 입니다.");
        }
    }
}
