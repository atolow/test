package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //Queue FIFO 먼저들어온게 먼저 나감
        //add, peek,poll
        //큐는 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>();


        intQueue.add(10);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println("intQueue.poll = " + intQueue.poll());
        }
        intQueue.add(10);
        intQueue.add(5);
        intQueue.add(9);

        System.out.println("intQueue.peek = " + intQueue.peek());
        System.out.println("intQueue.peek = " + intQueue.size());


    }
}
