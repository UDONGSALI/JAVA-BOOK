package _7.sec04.tset.ex05;

class A{
    void aver(int... val){
        double sum = 0;
        for (int i = 0; i < val.length; i++) {
            sum += val[i];
        }
        System.out.println(sum/ val.length);
    }
}

public class ex05 {
    public static void main(String[] args) {

        A a = new A();

        a.aver(1);
        a.aver(1,2);
        a.aver(1,2,3);
        a.aver(1,2,3,4);
        a.aver(1,2,3,58);

    }
}
