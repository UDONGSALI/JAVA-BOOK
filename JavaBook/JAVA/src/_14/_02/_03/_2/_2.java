package _14._02._03._2;

public class _2 {
    public static void main(String[] args) {

//         catch블록의 순서가 잘못 되었을 때
//        try {
//            System.out.println(3/1);
//            int n = Integer.parseInt("10s");
//        }
//        catch (Exception e){
//            System.out.println("숫자는 0으로 나눌 수 없습니다.");
//        }
//        catch (NumberFormatException e){
//            System.out.println("숫자로 바꿀 수 없습니다.");
//        }
//        finally {
//            System.out.println("프로그램 종료");
//        }


//        올바른 순서
        try {
            System.out.println(3/1);
            int n = Integer.parseInt("10s");
        }
        catch (NumberFormatException e){
            System.out.println("숫자로 바꿀 수 없습니다.");
        }
        catch (Exception e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
        finally {
            System.out.println("프로그램 종료");
        }

    }
}
