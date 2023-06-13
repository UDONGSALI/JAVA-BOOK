package _3.TEST;

public class test {
    public static void main(String[] args) {
        System.out.println(2 + 3 / 2);//3
        System.out.println(10 % 3 + 5 / 3);//2
        System.out.println((4 + 5 / 2) % 4);//2
        System.out.println();

        int a = 5;
        int b = a++;
        System.out.println(a);//6
        System.out.println(b);//5
        System.out.println(++a);//7
        System.out.println(++b);//6
        System.out.println(a++ + --b);//12
        System.out.println(a + b);//13
        System.out.println();


        //00101 00011
        System.out.println(5 & 3);//00001
        System.out.println(5 | 3);//00111
        System.out.println(5 ^ 3);//00110
        System.out.println(~5);//
        System.out.println();

        //00111
        System.out.println(7 << 2);//28
        System.out.println(7 >> 2);//1
        System.out.println(-7 << 2);//-28
        System.out.println(-7 >> 2);//-2 부호가 안바뀜
        System.out.println(-1 >>> 30);//3
        System.out.println();

        System.out.println(3 < 3);// false
        System.out.println(5 >= 3);// true
        System.out.println(5 == 5);// true
        System.out.println(5 != 5);// false
        System.out.println();

        System.out.println(false && true);//false
        System.out.println((4 <= 4) || (6 < 3)); //true
        System.out.println(false ^ (3 >= 4));// false
        System.out.println(!(3 <= 3));//false
    }
}
