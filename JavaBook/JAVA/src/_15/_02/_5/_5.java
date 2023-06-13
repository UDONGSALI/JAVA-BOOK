package _15._02._5;

public class _5 {
    public static void main(String[] args) {
        Thread simth  = new Thread(){
            @Override
            public void run() {
                super.run();
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


        Thread vith  = new Thread(){

            @Override
            public void run() {
                super.run();

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

        vith.start();
        simth.start();



    }
}
