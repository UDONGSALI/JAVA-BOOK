package _4.TEST;

public class Test {
    public static void main(String[] args) {
//        int score = 52;
//        if (score >= 80 && score < 90) {
//            System.out.println("B학점");
//        } else if (score >= 90) {
//            System.out.println("A학점");
//        } else if (score >= 70 && score < 80) {
//            System.out.println("C학점");
//        } else {
//            System.out.println("D학점");
//        }
//
//        switch (score/10){
//            case 10:
//            case 9:
//                System.out.println("A학점");
//                break;
//            case 8:
//                System.out.println("B학점");
//                break;
//            case 7:
//                System.out.println("C학점");
//                break;
//            case 6:
//                System.out.println("D학점");
//                break;
//            default:
//                System.out.println("F학점");
//                break;
//        }
        for (int i = 0; i <= 10; i+= 2) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i-=2) {
            System.out.println(i);
        }

        int a = 10;
        while (a>0){
            System.out.println(a);
            a-= 2;
        }

        for (int i = 0; ; i++) {
            if (i == 11)
                break;
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2) {
                    continue;
                }
                if (j == 1) {
                    break;
                }
                System.out.println("A");
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 3 && j == 2) {
                    i = 100;
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 3 && j == 2) {
                    break out;
                }
                System.out.println(i + " " + j);
            }
        }

    }
}
