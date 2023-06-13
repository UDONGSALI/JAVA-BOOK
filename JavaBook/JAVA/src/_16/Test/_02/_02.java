package _16.Test._02;

class MyClass{
    public <T> T myMethod(T t){
        return t;
    }
}

public class _02 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        String out1 = mc.<String>myMethod ("감사");
        Integer out2 = mc.<Integer>myMethod (3);
        Double out3 = mc.<Double>myMethod (5.8);

        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }
}
