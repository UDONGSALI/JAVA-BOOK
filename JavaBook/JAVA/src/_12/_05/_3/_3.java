package _12._05._3;

interface A{
    static void abc(){
        System.out.println("A 인터페이스의 정적메서트 abc()");
    }
}

public class _3 {

    public static void main(String[] args) {
        A.abc();
    }
}
