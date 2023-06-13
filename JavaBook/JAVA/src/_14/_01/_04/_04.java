package _14._01._04;

class A{}
class B extends A{}

public class _04 {
    public static void main(String[] args) {
        //UncheckedException = RuntimeException(실행 예외)

        //1.ArithmeticException
        System.out.println(3/1);

        //2.ClassCastException
        A a = new A();
        B b = (B)a;

        //3.ArrayIndexOutOfBoundsException
        int[] array = {1,2,3};
        System.out.println(array[4]);

        //4.NumberFormaException
        int num = Integer.parseInt("19!");

        //5.NullPointException
        String str = null;
        System.out.println(str.charAt(2));
    }
}
