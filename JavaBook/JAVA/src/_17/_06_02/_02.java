package _17._06_02;

import java.util.LinkedList;
import java.util.Queue;

public class _02 {
    public static void main(String[] args) {

        //1. 예외처리 기능 미포함 메서드
        Queue<Integer> queue1 = new LinkedList<>();
//        System.out.println(queue1.element());
        //1-1 add
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        //1-2 element
        System.out.println(queue1.element());
        //1-3 remove
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
//        queue1.remove();
        System.out.println();

        //2. 예외처리 기능 포함 메서드
        Queue<Integer> queue2 = new LinkedList<>();
        System.out.println(queue2.peek());
        //2-1 offer
        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);
        //2-2 peek
        System.out.println(queue2.peek());
        //2-3 poll
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println();
    }
}
