package queue;

public class TestPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<String> letters = new PriorityQueueHeap<>();
        letters.offer("A");
        letters.offer("F");
        letters.offer("B");
        letters.offer("G");
        letters.offer("D");
        letters.offer("I");
        letters.offer("E");
        for(int i = 0; i < 6; i++){
            System.out.println(letters.poll());
        }
    }

}