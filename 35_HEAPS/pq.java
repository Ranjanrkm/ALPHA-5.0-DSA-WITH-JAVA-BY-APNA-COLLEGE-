import java.util.PriorityQueue;
import java.util.Comparator;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder());

        prq.add(3);  // O(log n)
        prq.add(4);  // O(log n)
        prq.add(1);  // O(log n)
        prq.add(7);  // O(log n)

        while (!prq.isEmpty()) {
            System.out.println(prq.peek()); // O(1)
            prq.remove();                   // O(log n)
        }
    }
}