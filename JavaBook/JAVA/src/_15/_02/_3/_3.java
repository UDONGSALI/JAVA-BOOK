package _15._02._3;


class SMIFileRunable implements Runnable{

    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막 번호)" + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}

class VideoFileRunable implements Runnable {

    public void run() {
        int[] intArray = {1,2,3,4,5};

        for (int i = 0; i < intArray.length; i++) {
            System.out.print("비디오 프레임)" + intArray[i]  + "-");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}

public class _3 {
    public static void main(String[] args) {
        SMIFileRunable  sim = new SMIFileRunable();
        Thread sumth = new Thread(sim);

        VideoFileRunable vi = new VideoFileRunable();
        Thread vith = new Thread(vi);

        sumth.start();
        vith.start();


    }
}
