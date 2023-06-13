package _7.TEST.Q4;

import java.util.Arrays;

class A {
    void abc(int m) {
        m = 8;
    }
    void bcd(int[] n) {
        n[0] = 4; n[1] = 5; n[2] = 6;
    }
}
public class Q4 {
    public static void main(String[] args) {
        A a = new A();

        int m = 5;
        int[] n= {1, 2, 3};

        a.abc(m);
        a.bcd(n);

        System.out.println(m);//5
        System.out.println(Arrays.toString(n));// 4 5 6

        //아마 메모리 저장 방식 때문에 차이가 나는 것으로 보임
    }
}
