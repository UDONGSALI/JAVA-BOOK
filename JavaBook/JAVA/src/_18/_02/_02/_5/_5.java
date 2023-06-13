package _18._02._02._5;

interface A{
    int abc(String str);
}

public class _5 {
    public static void main(String[] args) {

        A a1 = new A() {
            @Override
            public int abc(String str) {
                return str.length();
            }
        };

        A a2 = (str) -> {
            return str.length();
        };

        A a3 = String::length;

        System.out.println(a1.abc("하이"));
        System.out.println(a2.abc("하이볼"));
        System.out.println(a3.abc("아아아아아"));
    }
}
