import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // MaxHeap
        // Queue<Integer> pq = new PriorityQueue<>(); //MinHeap

        pq.offer(40);
        pq.offer(12);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }

}
