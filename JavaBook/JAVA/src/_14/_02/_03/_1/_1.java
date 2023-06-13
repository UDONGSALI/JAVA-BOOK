package _14._02._03._1;

public class _1 {
    public static void main(String[] args) {
        // 단일 try catch
        try {
            System.out.println(3/0);
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
        finally {
            System.out.println("프로그램 종료");
        }

        try {
            int n = Integer.parseInt("10s");
        }
        catch (NumberFormatException e){
            System.out.println("숫자로 바꿀 수 없습니다.");
        }
        finally {
            System.out.println("프로그램 종료");
        }
        System.out.println();

        // 다중 try catch
        try {
            int n = Integer.parseInt("10s");
            System.out.println(3/0);
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
        catch (NumberFormatException e){
            System.out.println("숫자로 바꿀 수 없습니다.");
        }
        finally {
            System.out.println("프로그램 종료");
        }

    }
}
