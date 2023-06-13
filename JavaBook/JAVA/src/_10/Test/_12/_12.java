package _10.Test._12;

class A{
    int data;
    A(int data){
        this.data = data;
    }
    public boolean equals(Object obj){
        if (this.data == ((A)obj).data){
            return true;
        }else return false;
    }
}

public class _12 {
    public static void main(String[] args) {
        A a1 = new A(3);
        A a2 = new A(3);

        System.out.println(a1.equals(a2));

    }
}
