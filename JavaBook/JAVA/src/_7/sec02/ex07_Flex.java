package _7.sec02;

public class ex07_Flex {
    public static void main(String[] args) {
        //method
        method01(1,2,3,4,5);
        method02("가","나","다","라","마");
        method02();

    }
    public static void method01(int... values){
        System.out.println("배열의 길이 : " + values.length);
        for (int k :values) {
            System.out.print(k+ " ");
        }
        System.out.println();
    }
    public static void method02(String... values){
        System.out.println("배열의 길이 : " + values.length);
        for (String k :values) {
            System.out.print(k+ " ");
        }
        System.out.println();
    }

}
