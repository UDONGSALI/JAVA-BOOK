package _3.sec01;

public class ex06_AssignmentOperator {
    public static void main(String[] args) {
        //대입 연산자와 축약 표현
        //대입 연산자
        int value = 3;
        value = value + 3;
        System.out.println(value);
        System.out.println();

        //축약 표현
        int value2;
        value2 = 5; System.out.println(value2 += 2);
        value2 = 5; System.out.println(value2 -= 2);
        value2 = 5; System.out.println(value2 *= 2);
        value2 = 5; System.out.println(value2 /= 2);
        value2 = 5; System.out.println(value2 %= 2);
        value2 = 5; System.out.println(value2 |= 2);
        value2 = 5; System.out.println(value2 <<= 2);
        value2 = 5; System.out.println(value2 >>= 2);
        value2 = 5; System.out.println(value2 >>>= 2);
    }
}
