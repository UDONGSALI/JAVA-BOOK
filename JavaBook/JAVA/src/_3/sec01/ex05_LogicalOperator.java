package _3.sec01;

public class ex05_LogicalOperator {
    public static void main(String[] args) {
        //논리 연산자
        //AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && (5 < 3));
        System.out.println((5 >= 5) && (9 > 2));
        System.out.println();

        //OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || (5 < 3));
        System.out.println((5 >= 5) || (9 > 2));
        System.out.println();

        //XOR
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ (5 < 3));
        System.out.println((5 >= 5) ^ (9 > 2));
        System.out.println();

        //Not
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(false || !(5 < 3));
        System.out.println((5 >= 5) || !(9 > 2));
        System.out.println();

        //비트 연산자로 논리 연산 수행
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(true | (5 < 3));
        System.out.println((5 >= 5) | (9 > 2));
        System.out.println();

        //쇼트서킷 사용 여부
        int value = 3;
        System.out.println(false && ++value > 6);
        System.out.println(value);

        int value2 = 3;
        System.out.println(false & ++value > 6);
        System.out.println(value);

        int value3 = 3;
        System.out.println(true || ++value3 > 6);
        System.out.println(value3);

        int value4 = 3;
        System.out.println(true | ++value3 > 6);
        System.out.println(value3);


    }
}
