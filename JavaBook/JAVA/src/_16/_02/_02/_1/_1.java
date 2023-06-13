package _16._02._02._1;

class MyClass<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}

public class _1 {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>();
        mc1.set("안녕");
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<Integer>();
        mc2.set(500);
        System.out.println(mc2.get());


    }
}
