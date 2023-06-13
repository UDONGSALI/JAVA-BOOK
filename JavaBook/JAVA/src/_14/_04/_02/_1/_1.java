package _14._04._02._1;

public class _1 {
    public static void main(String[] args) {

        //1. 예외 갹체를 생성 했을 때 메세지를 전달하지 않았을 경우
        try {
            throw new Exception();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        //2. 예외 갹체를 생성 했을 때 메세지를 전달한 경우
        try {
            throw new Exception("예외 메세지");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
