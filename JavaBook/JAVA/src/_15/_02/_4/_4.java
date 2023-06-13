package _15._02._4;

public class _4 {
    public static void main(String[] args) {
        Runnable sim = new Runnable() {
            @Override
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
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        Runnable video = new Runnable() {
            @Override
            public void run() {
                int[] intArray = {1, 2, 3, 4, 5};

                for (int i = 0; i < intArray.length; i++) {
                    System.out.print("비디오 프레임)" + intArray[i] + "-");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        Thread videoth = new Thread(video);
        Thread simth = new Thread(sim);

        videoth.start();
        simth.start();


    }
}
