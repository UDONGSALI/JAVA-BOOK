package _15._05._03._1;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(" --sleep() 중 interrupt 발생--");
            for (long i = 0; i < 100000000L; i++) {
            } //시간지연
        }
    }
}

public class _1 {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
//#Thread.sleep()
        Thread.sleep(100); //run()이 시작되기까지 시간여유
        System.out.println("MyThread State : " + myThread.getState()); //TIMED_WAITING
//#interrupt()
        myThread.interrupt();
        Thread.sleep(100); //예외발생까지의 시간여유
        System.out.println("MyThread State : " + myThread.getState()); //RUNNABLE
    }
}
