package _14._04._01;

class MyExction extends Exception {
    public MyExction() {
        super();
    }

    public MyExction(String message) {
        super(message);
    }
}

class MyRTExction extends Exception {
    public MyRTExction() {
        super();
    }

    public MyRTExction(String message) {
        super(message);
    }
}

class A {

    MyExction me1 = new MyExction();
    MyExction me2 = new MyExction("예외 메시지 : MyException");
    MyRTExction mre1 = new MyRTExction();
    MyRTExction mre2 = new MyRTExction("예외 메시지 : MyException");

    void abc_1(int num) {
        try {
            if (num > 70) {
                System.out.println("정상 작동");
            } else {
                throw me1;
            }
        } catch (MyExction e) {
            System.out.println("예외처리 1");
        }
    }

    void bcd_1() {
        abc_1(65);
    }

    void abc_2(int num) throws MyExction {
        if (num > 70) {
            System.out.println("정상 작동");
        } else {
            throw me1;
        }
    }
    void bcd_2() {
        try {
            abc_2(65);
        }
        catch (MyExction e){
            System.out.println("예외처리 2");
        }
    }





}

public class _01 {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}
