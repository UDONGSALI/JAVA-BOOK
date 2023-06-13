package _15._03._04;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000000; i++) {

        }
        System.out.println(getName() + " 우선순위 " + getPriority());
    }
}

public class _04 {
    public static void main(String[] args) {

        System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread();
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        for (int i = 0; i < 10; i++) {
            Thread tread = new MyThread();
            tread.setName(i + "번쨰 쓰레드");

            if (i == 9)tread.setPriority(10);
            tread.start();
        }
    }
}