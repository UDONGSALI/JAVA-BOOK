package _15._04._02;

class Mydata{
    int data = 3;
    public void plusData(){
        synchronized (this){
            int mydata = data;
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            data = mydata +1;
        }
    }
}

class PlusThread extends Thread{
    Mydata mydata;
    public  PlusThread(Mydata mydata){
        this.mydata = mydata;
    }

    @Override
    public void run() {
        mydata.plusData();
        System.out.println(getName() + "실행 결과" + mydata.data);
    }
}

public class _02 {
    public static void main(String[] args) {
        Mydata mydata  = new Mydata();

        Thread plusThread1 = new PlusThread(mydata);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        Thread plusThread2 = new PlusThread(mydata);
        plusThread2.setName("plusThread2");
        plusThread2.start();
    }
}
