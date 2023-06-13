package _13._02._02._2;

interface A{
    public abstract void abc();
}

class C{
    void cbd(A a){
        a.abc();
    }
}

public class _2 {
    public static void main(String[] args) {
        C c =new C();

        A a = new A() {
            @Override
            public void abc() {
                System.out.println("입력 매개변수 전달");
            }
        };
        c.cbd(a);

        c.cbd(new A() {
            @Override
            public void abc() {
                System.out.println("입력 매개변수 전달");
            }
        });








    }





}
