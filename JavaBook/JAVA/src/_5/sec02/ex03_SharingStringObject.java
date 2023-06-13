package _5.sec02;

public class ex03_SharingStringObject {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = "안녕";
        String str3 = "안녕";
        String str4 = new String("안녕");
        String str5 = "안녕";
//@stack메모리값 비교 (객체의 번지(위치))
        System.out.println(str1 == str2); //false
        System.out.println(str2 == str3); //true
        System.out.println(str3 == str4); //false
        System.out.println(str4 == str1); //false
        System.out.println(str3 == str5); //true
    }
}
