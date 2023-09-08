package QueuePackage;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PriorQueue {
    public static void main(String[] args) {
        //is am implimentation that orders the elent by using the priority
        Queue<Integer> gtBankQueue = new PriorityQueue<>();
       gtBankQueue.offer(100);
       gtBankQueue.offer(100);
       gtBankQueue.offer(100);
       gtBankQueue.offer(100);
        gtBankQueue.offer(100);
        gtBankQueue.offer(100);
        gtBankQueue.offer(100);
        gtBankQueue.offer(100);
        System.out.println(gtBankQueue);
    }
    Queue<Integer> accessBankQueue = new PriorityQueue<>();
    Queue<Integer> unioBankQueue = new LinkedList<>();
    Queue<Integer> unionBankQueue = new ArrayBlockingQueue<>(20);
}
