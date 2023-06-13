package _14._02._01;

public class _01 {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("프로그램을 종료합니다.");
        }
        catch(ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램을 종료합니다.");
        }

        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
        finally{
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
