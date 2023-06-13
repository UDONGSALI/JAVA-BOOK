package _16._05._2;

class Parent{
    <T extends Number> void  print(T t){
        System.out.println(t);
    }
}

class Child extends Parent{

}

public class _2 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.<Integer>print(100);
        p.print(100);


        Child c = new Child();
        c.<Integer>print(100);
        c.print(100);
    }
}
