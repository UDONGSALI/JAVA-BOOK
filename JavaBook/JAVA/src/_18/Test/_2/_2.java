package _18.Test._2;
interface A{
    int abc(String str);
}

public class _2 {
    public static void main(String[] args) {

        A a = new A() {
            @Override
            public int abc(String str) {
                return str.length();
            }
        };
    }
}
