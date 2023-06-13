package _17._02._04;

import java.util.*;

public class _04 {
    public static void main(String[] args) {

        List<Integer> aList1 = new Vector<>();
        //1.add
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1);
        System.out.println();
        System.out.println();

        //2.add(int index, E element)
        aList1.add(1,6);
        System.out.println(aList1);
        System.out.println();
        System.out.println();

        //3.addAll(또 다른 리스트 객체)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2);
        System.out.println();
        System.out.println();

        //4. addAll(index , 또 다른 리스트 객체)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(1);
        aList3.add(2);
        aList3.addAll(1, aList3);
        System.out.println(aList3);
        System.out.println();
        System.out.println();

        //5. set (int index, E element)
        aList3.set(1,5);
        aList3.set(3,6);
//        aList3.set(4,7);
        System.out.println(aList3);
        System.out.println();
        System.out.println();


        //6. remove (int index)
        aList3.remove(1);
        System.out.println(aList3);
        System.out.println();
        System.out.println();

        //7. remove (object o)
        aList3.remove(new Integer (2));
        System.out.println(aList3);
        System.out.println();
        System.out.println();

        //8. clear()
        aList3.clear();
        System.out.println(aList3);
        System.out.println();
        System.out.println();

        //9. isempty()
        System.out.println(aList3.isEmpty());
        System.out.println();
        System.out.println();

        //10. size
        System.out.println(aList3.size());
        aList3.add(1);
        aList3.add(2);
        aList3.add(3);
        System.out.println(aList3);
        System.out.println(aList3.size());
        System.out.println();
        System.out.println();

        //11. get(int index)
        System.out.println("0번째:  " + aList3.get(0));
        System.out.println("1번째:  " + aList3.get(1));
        System.out.println("2번째:  " + aList3.get(2));
        for (int i = 0; i < aList3.size(); i++) {
            System.out.println(i + "번째" + aList3.get(i));
        }
        System.out.println();
        System.out.println();

        //12. toArray() List -> Array
        Object[] object = aList3.toArray();
        System.out.println(Arrays.toString(object));

        Integer[] integer1 = aList3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1));

        Integer[] integer2 = aList3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2));


    }
}
