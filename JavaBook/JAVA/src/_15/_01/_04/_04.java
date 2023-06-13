package _15._01._04;

public class _04 {
    public static void main(String[] args) {
        int[] a ={ 1, 2, 3 ,4 ,5};
        String[] s ={"하나", "둘", "셋", "넷", "다섯" };

        for (int i = 0; i < a.length; i++) {
            System.out.println("(비디오 프레임) " + a[i]);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){}
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println("(자막) " + s[i]);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){}
        }
    }
}
