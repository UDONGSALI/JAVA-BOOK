package _4.sec02;

public class ex02_While {
    public static void main(String[] args) {
        //while의 기본 문법 구조
        int a = 0;
        while (a<10){
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        //for문으로 변화
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int b = 10;
        while (b > 0){
            System.out.print(b + " ");
            b--;
        }
        System.out.println();

        // for문으로 변화
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //while문으로 만든 무한 루프
//        while (true){
//            System.out.print("무한루프");
//        }
        System.out.println();
        //무한루프 탈출
        int c = 0;
        while (true){
            if (c >10){
                break;
            }
            System.out.print(c + " ");
            c++;
        }
    }
}
