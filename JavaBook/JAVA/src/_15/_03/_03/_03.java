package _15._03._03;

public class _03 {
    public static void main(String[] args) {

        Thread curTread = Thread.currentThread();
        System.out.println("현재 쓰레드의 이름" + curTread.getName());
        System.out.println("동작하는 쓰레드의 갯수" + Thread.activeCount());


        for (int i = 0; i < 3; i++) {
            Thread te = new Thread();
            System.out.println(te.getName());

            te.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread te = new Thread();
            te.setName(i + "번째 쓰레드");
            System.out.println(te.getName());

            te.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread te = new Thread();
            System.out.println(te.getName());

            te.start();
        }

        System.out.println("동작하는 쓰레드 갯수 " + Thread.activeCount());

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
