package _16.Test._06;

class A<K> {
    K k;

    public void setK(K k) {
        this.k = k;
    }
}

class B<V, K> extends A<K> {
    V v;
    public void setV(V v){
        this.v = v;
    }
    public void print() {
        System.out.println(k + " : " + v);
    }

}

public class _06 {
    public static void main(String[] args) {
        B <String, Integer>b = new B<String, Integer>();
        b.setK(1);
        b.setV("감사");
        b.print();
    }
}
