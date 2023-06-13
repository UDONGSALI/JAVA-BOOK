package _7.TEST.Q5;

class A {
    double aver (int... val){
        double sum = 0;
        for (int i = 0; i < val.length; i++) {
            sum += val[i];
        }
     return sum/val.length;
    }
}

public class Q5 {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.aver(1));
        System.out.println(a.aver(1, 2));
        System.out.println(a.aver(1, 2, 3));
        System.out.println(a.aver(1, 2, 3, 4));


    }
}
