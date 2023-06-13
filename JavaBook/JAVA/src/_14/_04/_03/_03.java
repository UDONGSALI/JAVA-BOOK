package _14._04._03;

//점수가 음수일때 예외 발생
class MinusException extends Exception{
    public MinusException(){
        super();
    }
    public MinusException(String message){
        super(message);
    }
}
class OverException extends Exception{
    public OverException(){
        super();
    }
    public OverException(String message){
        super(message);
    }
}
class A{
    void checkScore(int score) throws MinusException, OverException{
        if (score < 0){
            throw  new MinusException("예외 발생 : 음수값 입력");
        }else if (score > 100){
            throw  new MinusException("예외 발생 : 범위 초과");
        }else {
            System.out.println("점수 : " + score);
        }
    }
}
public class _03 {
    public static void main(String[] args) throws MinusException, OverException {
        A a = new A();
        try {
            a.checkScore(85);
            a.checkScore(85);
            a.checkScore(85);
            a.checkScore(150);
            a.checkScore(150);

        }
        catch (MinusException | OverException e){
            System.out.println(e.getMessage());
        }
    }
}
