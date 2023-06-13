package _17.Test._7;

import java.util.TreeSet;

class MyData implements Comparable<MyData> {
    String str;
    public MyData(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(MyData o) {
        if(str.length() < o.str.length()) return -1;
        else if (str.length() == o.str.length()) return  0;
        else return 1;
    }

    @Override
    public String toString() {
        return str;
    }
}

public class _7 {
    public static void main(String[] args) {
        MyData md4 = new MyData("감사합니다");
        MyData md1 = new MyData("자바 프로그램");
        MyData md2 = new MyData("반가워");
        MyData md3 = new MyData("안녕");
        TreeSet<MyData> treeSet = new TreeSet<>();
        treeSet.add(md1);
        treeSet.add(md2);
        treeSet.add(md3);
        treeSet.add(md4);
        System.out.println(treeSet);
    }
}
