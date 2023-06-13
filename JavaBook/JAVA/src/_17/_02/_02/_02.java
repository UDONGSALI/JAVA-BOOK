package _17._02._02;

import java.util.*;

public class _02 {
    public static void main(String[] args) {

        List<Integer> aList1 = new ArrayList<>();
        List<Integer> aList2 = new ArrayList<>(30);
        List<Integer> aList3 = new Vector<>();
        List<Integer> aList4 = new Vector<>(20);
        List<Integer> aList5 = new LinkedList<>();
//        List<Integer> aList6 = new LinkedList<>(50);

        List<Integer> aList7 = Arrays.asList(1, 2, 3, 4);
        List<String> aList8 = Arrays.asList("안녕", "방가");
        aList7.set(1, 7);
        aList8.set(0, "감사");
//        aList7.add(10);
//        aList7.remove(4);
        System.out.println(aList7);
        System.out.println(aList8);
    }
}
