package _14._02._04._1;

import java.io.IOException;
import java.io.InputStreamReader;

public class _1 {
    public static void main(String[] args) {


        System.out.println("문자를 입력하세요");

        //sytem.in을 해제하면 더이상 리소스 입력 불가
        //1. 리소스 자동 해제
        try (InputStreamReader is1  = new InputStreamReader(System.in);){
            char input =(char) is1.read();
            System.out.println("입력글자 : " + input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //2. 리소스 수동 해제
        InputStreamReader is2 = null;
        try {
            is2 = new InputStreamReader(System.in);
            char input = (char) is2.read();
            System.out.println("입력글자 : " + input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //리소스 해제 구문
            if (is2  !=  null){
                try {
                    is2.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
