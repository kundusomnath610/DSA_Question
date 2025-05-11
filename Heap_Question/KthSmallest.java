package Heap_Question;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println("The Grater value is: " + kthSmallest(arr, 3));
    }
    
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
