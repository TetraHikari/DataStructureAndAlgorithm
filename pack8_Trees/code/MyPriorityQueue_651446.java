package code;

// import java.util.Arrays;
// import java.util.List;
// import java.util.PriorityQueue;


public class MyPriorityQueue_651446 implements MyQueueInterface {
    private MyMinHeap_651446 heap;
    private int capacity;

    public MyPriorityQueue_651446(int capacity) {
        this.heap = new MyMinHeap_651446();
        this.capacity = capacity;
    }

    public MyPriorityQueue_651446() {
        this(6);
    }

    @Override
    public void enqueue(int d) {
        if (!isFull()) {
            heap.insert(d);
        } else {
            System.out.println("Queue is full. Cannot enqueue " + d);
        }
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            return heap.remove();
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
    }

    @Override
    public int front() {
        if (!isEmpty()) {
            return heap.peek(); // The element at the top of the heap is the highest-priority element.
        } else {
            System.out.println("Queue is empty. No front element.");
            return -1; 
        }
    }

    @Override
    public boolean isFull() {
        return heap.size() >= capacity;
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }


    @Override
    public String toString() {
    return heap.toString();
}

}
