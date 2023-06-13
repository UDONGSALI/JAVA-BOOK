package _15._02._1;

class SMIFilethread extends Thread {

    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막번호)" + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}

public class _1 {
    public static void main(String[] args) {


        Thread smiFileThread = new SMIFilethread();
        smiFileThread.start();

        int[] intArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < intArray.length; i++) {
            System.out.print("(비디오 프레임)" + intArray[i] + "-");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

        }
    }

}