package _15._05._03._2;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (long
             i = 0;
             i < 1000000000L;
             i++) {
        }
    }
}

class MyThread2 extends Thread {
    MyThread1 myThread1;

    public MyThread2(MyThread1 myThread1) {
        this.myThread1 = myThread1;
    }

    @Override
    public void run() {
        try {
            myThread1.join(3000);
        } catch (InterruptedException e) {
            System.out.println(" --join()중 interrupt 발생--");
        }
        for (long
             i = 0;
             i < 1000000000L;
             i++) {
        }
    }
}

public class _2 {
    public static void main(String[] ar) throws InterruptedException {
//#1. join(...) - interrupt() Test
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2(myThread1);
        myThread1.start();
        myThread2.start();
        try{Thread.sleep(100);}catch (InterruptedException e){}
        System.out.println("MyThread1 State : " + myThread1.getState()); //RUNNABLE
        System.out.println("MyThread2 State : " + myThread2.getState()); //TIMED_WAITING
        myThread2.interrupt();
        try{Thread.sleep(100);}catch (InterruptedException e){}
        System.out.println("MyThread1 State : " + myThread1.getState()); //RUNNABLE
        System.out.println("MyThread2 State : " + myThread2.getState()); //RUNNABLE
    }
}
