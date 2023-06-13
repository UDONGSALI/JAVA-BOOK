package _17._03._03._1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _1 {
    public static void main(String[] args) {
        Set<String> hSet1 = new HashSet<>();
        //1. add (E element)
        hSet1.add("가");
        hSet1.add("나");
        hSet1.add("가");
        System.out.println(hSet1.toString());

        //2. addAll(다른 set 객체)
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("가");
        hSet2.add("나");
        hSet2.addAll(hSet1);
        System.out.println(hSet2.toString());

        //3. remove(Objetc o)
        hSet2.remove("나");
        System.out.println(hSet2.toString());

        //4. clear
        hSet2.clear();
        System.out.println(hSet2.toString());

        //5. isEmpty
        System.out.println(hSet2.isEmpty());

        //6. contains
        Set<String> hSet3 = new HashSet<>();
        hSet3.add("가");
        hSet3.add("나");
        hSet3.add("다");
        System.out.println(hSet3.contains("나"));
        System.out.println(hSet3.contains("라"));

        //7. siza()
        System.out.println(hSet3.size());

        //8. iterator
        Iterator<String> iterator = hSet3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //9.toArray()
        Object[] obArray = hSet3.toArray();
        System.out.println(Arrays.toString(obArray));

        //10.1 toArray(T[] t)
        String[] sArray1 = hSet3.toArray(new String[0]);
        System.out.println(Arrays.toString(sArray1));

        //10.1 toArray(T[] t)
        String[] sArray2 = hSet3.toArray(new String[5]);
        System.out.println(Arrays.toString(sArray2));
    }
}
