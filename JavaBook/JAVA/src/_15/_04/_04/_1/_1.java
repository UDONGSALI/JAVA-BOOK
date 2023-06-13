package _15._04._04._1;

class MyData {
    synchronized void abc() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized void bcd() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    void cde() {
        synchronized (new Object()) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + "번째");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

public class _1 {
    public static void main(String[] args) {

        MyData myData = new MyData();

        new Thread() {
            @Override
            public void run() {
                myData.abc();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                myData.bcd();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                myData.cde();
            }
        }.start();
    }
}
