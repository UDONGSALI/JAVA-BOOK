package _18.Test._6;

interface A{

    void abc(int a, double b);


}
class B{

    B(){
        System.out.println("첫 번째 생성자");
    }
    B(int a){
        System.out.println("두 번째 생성자");
    }
    B(int a, double b){
        System.out.println("세 번째 생성자");
    }
}

public class _6 {
    public static void main(String[] args) {
        A a = B::new;
        a.abc(3, 5.8);
    }
}
