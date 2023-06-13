package _14._02._03._3;

public class _3 {
    public static void main(String[] args) {
        //캐치 블록을 각각 처리 했을 때
        try {
            System.out.println(3/1);
            int n = Integer.parseInt("10s");
        }
        catch (ArithmeticException e){
            System.out.println("예외가 발생 했습니다.");
        }
        catch (NumberFormatException e){
            System.out.println("예외가 발생 했습니다.");
        }

        try {
            System.out.println(3/1);
            int n = Integer.parseInt("10s");
        }
        catch (ArithmeticException | NumberFormatException e){
            System.out.println("예외가 발생 했습니다.");
        }
    }
}
