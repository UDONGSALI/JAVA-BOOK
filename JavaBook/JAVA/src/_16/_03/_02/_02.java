package _16._03._02;

class A{
    public <T> void  method1(T t){
//        System.out.println(t.length());
        System.out.println(t.equals("안녕"));
    }

}

public class _02 {
    public static void main(String[] args) {
        A a = new A();
        a.method1("안녕");
    }
}
