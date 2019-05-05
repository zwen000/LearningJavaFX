import java.util.PriorityQueue;

public class priorityQ {

    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();

        queue.offer(91.1);
        queue.offer(9.2);
        queue.offer(5.1);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
    }
}
