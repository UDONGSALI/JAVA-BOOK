package _15._03._05._1;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " : " + (isDaemon()? "데몬 쓰레드" : "일반 쓰레드"));
        for (int i = 0; i < 6; i++) {
            System.out.println(getName() + " : " + i + "초");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){};
        }
    }
}

public class _1 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.setDaemon(true);
        thread1.setName("tread1");
        thread1.start();

        Thread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.setName("tread2");
        thread2.start();

        try {
            Thread.sleep(3500);
        }catch (InterruptedException e){};
        System.out.println("main thread 종료");
    }
}
