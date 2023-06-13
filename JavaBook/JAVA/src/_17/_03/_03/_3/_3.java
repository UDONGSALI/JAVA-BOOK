package _17._03._03._3;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class _3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 50; i > 0; i -= 2) {
            treeSet.add(i);
        }
        System.out.println(treeSet.toString());

        System.out.println(treeSet.first());

        System.out.println(treeSet.last());

        System.out.println(treeSet.lower(26));

        System.out.println(treeSet.higher(26));


        System.out.println(treeSet.floor(25));
        System.out.println(treeSet.floor(26));

        System.out.println(treeSet.ceiling(25));
        System.out.println(treeSet.ceiling(26));
        System.out.println();

        //8 pollFirst()
        int treesize = treeSet.size();
        System.out.println(treesize);
        for (int i = 0; i < treesize; i++) {
            System.out.print(treeSet.pollFirst() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());
        //8 pollLast()
        for (int i = 50; i >  0 ; i -= 2) {
            treeSet.add(i);
        }
        for (int i = 0; i < treesize; i++) {
            System.out.print(treeSet.pollLast() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());

        //9. SortedSet<E> headSet(E element)
        for (int i = 50; i >  0 ; i -= 2) {
            treeSet.add(i);
        }
        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println(sSet.toString());
        //10. NavigableSet<E> headSet(E element, boolean inclusive)
        NavigableSet<Integer> nSet = treeSet.headSet(20,true);
        System.out.println(nSet.toString());
        nSet = treeSet.headSet(20,false);
        System.out.println(nSet.toString());
        //11.SortedSet<E> tailSet(E element)
        sSet = treeSet.tailSet(20);
        System.out.println(sSet.toString());
        //12. NavigableSet<E> tailSet(E element)
        nSet = treeSet.tailSet(20,true);
        System.out.println(nSet.toString());
        nSet = treeSet.tailSet(20,false);
        System.out.println(nSet.toString());
        //13. SortedSet<E> SubSet(E element,boolean inclusive))
        sSet = treeSet.subSet(10 ,20);
        System.out.println(sSet.toString());
        //14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
        nSet = treeSet.subSet(10, true,20 ,false);
        System.out.println(nSet.toString());
        nSet = treeSet.subSet(10, false,20 ,true);
        System.out.println(nSet.toString());

        //15. NavigableSet<E> descendingset
        System.out.println(treeSet);
        NavigableSet<Integer> deSet = treeSet.descendingSet();
        System.out.println(deSet.toString());
        deSet = deSet.descendingSet();
        System.out.println(deSet.toString());

    }
}
