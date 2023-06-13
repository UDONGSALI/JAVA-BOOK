package _8;

class A{
    boolean m1;
    int m2;
    double m3;
    String m4;

    void PritFieldValue(){
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
    void PrintLocalVariable(){
        int k;
//        System.out.println(k);
    }
}

public class ex01_InitialValueOf {
    public static void main(String[] args) {
        //클래스를 활용해 객체 생성
        A a = new A();
        a.PritFieldValue();
    }
}
