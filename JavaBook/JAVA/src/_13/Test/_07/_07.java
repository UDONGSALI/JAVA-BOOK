package _13.Test._07;

class A{
    interface B{
        void abc();
    }
}



public class _07 {
    public static void main(String[] args) {
        A.B ab = new A.B() {
            @Override
            public void abc() {
                System.out.println("확인");
            }
        } ;
        ab.abc();
    }
}
