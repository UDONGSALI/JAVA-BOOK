package _14.Test._05;

class A implements AutoCloseable{

    String res = null;

    @Override
    public void close() throws Exception {
        res = null;
        System.out.println("리소스 자동 해제");
    }
}

public class _05 {
    public static void main(String[] args) {
        try (A b  = new A()){

        }
        catch (Exception e){

        }

    }
}
