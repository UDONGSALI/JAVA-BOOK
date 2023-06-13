package _14._02._04._2;

class A implements AutoCloseable{
    String resource ;
    A(String resource) {
        this.resource=resource;
    }
    void abc() throws Exception {
    }
    @Override
    public void close() throws Exception {
        if(resource !=null) {
            resource=null;
            System.out.println("리소스 해제");
        }
    }
}

public class _02 {
    public static void main(String[] args) {


        //#1. 리소스를 사용하고 finally에서 리소스 해제하기
        A a1 = null;
        try {
            a1=new A("특정파일");
            a1.abc();
        } catch (Exception e) {
            System.out.println("예외처리");
        } finally {
            if(a1.resource!=null)
                try {
                    a1.close();
                } catch (Exception e) {}
        }

        //#2. try with resource 구문을 이용해서 자동으로 해제
        try (A a2 = new A("특정파일");){
            a2.abc();
        } catch (Exception e) {
            System.out.println("예외처리");
        }
    }
}
