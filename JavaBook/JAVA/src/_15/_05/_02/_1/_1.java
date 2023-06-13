package _15._05._02._1;

public class _1 {
    public static void main(String[] args) {

        Thread mythread = new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 100000000; i++) {

                }
            }
        };
        System.out.println("mythread state = " + mythread.getState());


        mythread.start();
        System.out.println("mythread state = " + mythread.getState());

        try {
            mythread.join();
        }catch (InterruptedException e){}
        System.out.println("mythread state = " + mythread.getState());



    }
}
