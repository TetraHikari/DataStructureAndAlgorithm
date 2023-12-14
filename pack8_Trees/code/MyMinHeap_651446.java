package code;

public class MyMinHeap_651446 {

    int MAX_SIZE = 100;
    int heap[] = new int[MAX_SIZE];
    int size = 0;

    public void insert(int d) {
        if (size < MAX_SIZE) {
            heap[size] = d;
            size++;
            heapifyUp();
        } else {
            System.out.println("Heap is full. Cannot insert " + d);
        }
    }

    public int remove() {
        if (size > 0) {
            int root = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown();
            return root;
        } else {
            System.out.println("Heap is empty. Cannot remove.");
            return -1;
        }
    }

    public int peek() {
        if (size > 0) {
            return heap[0];
        } else {
            System.out.println("Heap is empty. No peek.");
            return -1;
        }
    }

    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }
  
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s += heap[i];
            if (i < size - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }

    public int size() {
        return size;
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (heap[index] < heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private int parent(int index) {
        return heap[getParentIndex(index)];
    }

    private int leftChild(int index) {
        return heap[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return heap[getRightChildIndex(index)];
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }



}
