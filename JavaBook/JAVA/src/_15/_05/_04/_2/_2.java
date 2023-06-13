package _15._05._04._2;

class DataBox{

    boolean emt = true;
    int data;

    synchronized void inputData(int data){
        if (!emt){
            try {
                wait();
            }catch (InterruptedException e){}
        }
        this.data = data;
        emt = false;
        System.out.println("입력 데이터 : " + data);
        notify();
    }
    synchronized void outputData(){
        if (emt){
            try {
                wait();
            }catch (InterruptedException e){}
        }
        emt = true;
        System.out.println("출력 데이터 : " + data);
        notify();
    }
}

public class _2 {
    public static void main(String[] args) {

        DataBox dataBox = new DataBox();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    try {
                        sleep(500);
                    }catch (InterruptedException e){}
                    dataBox.inputData(i);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    try {
                        sleep(500);
                    }catch (InterruptedException e){}
                    dataBox.outputData();
                }
            }
        };

        t1.start();
        t2.start();

    }
}
