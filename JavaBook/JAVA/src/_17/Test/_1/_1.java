package _17.Test._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(1, 2);
        list2. add(3);
        System.out.println(list2);
    }
}
