package _12._03._2;

interface A{
    int a=3;
    void abc();
}

public class _2 {
    public static void main(String[] args) {
        A a1 = new A(){
            @Override
            public void abc() {
                System.out.println("익명 이너 클래스를 이용한 방법");
            }
        };
        a1.abc();
    }
}
