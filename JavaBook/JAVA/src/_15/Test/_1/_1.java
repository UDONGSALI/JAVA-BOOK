package _15.Test._1;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(i + "초");
        }
    }
}

public class _1 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();
    }
}
