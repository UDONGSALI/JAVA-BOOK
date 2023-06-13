package _10.Test._05;

class A{

}
class B extends A{

}
class C extends A{

}
class D extends B{

}
public class _05 {
    public static void main(String[] args) {
        D ad = new D();
        System.out.println(ad instanceof B);
    }
}
