package _18._02._03._1;

interface A {
    int[] abc(int len);
}

public class _1 {
    public static void main(String[] args) {

        A a1 = new A() {
            @Override
            public int[] abc(int len) {
                return new int[len];
            }
        };

        A a2 = (len) -> {
            return new int[len];
        };

        A a3 = int[]::new;

        int[] arr1 = a1.abc(3);
        System.out.println(arr1.length);
        int[] arr2 = a2.abc(3);
        System.out.println(arr1.length);
        int[] arr3 = a3.abc(3);
        System.out.println(arr1.length);

    }
}
