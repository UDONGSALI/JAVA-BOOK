package _4.sec01;

public class ex02_Switch {
    public static void main(String[] args) {
        //break가 포함되지 않았을 때
        int value = 2;
        switch (value){
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            default:
                System.out.println("D");
        }
        System.out.println();

        //break가 포함되었을 때
        int value2 = 2;
        switch (value2){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
        System.out.println();
        // in - else if - else 문으로 변환
        if (value2 == 1){
            System.out.println("A");
        } else if (value == 2){
            System.out.println("B");
        } else if (value == 3){
            System.out.println("C");
        } else{
            System.out.println("D");
        }

    }
}
