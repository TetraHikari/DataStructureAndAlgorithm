import java.util.ArrayList;

// import javax.xml.namespace.QName;

import code.*;

    public class L8_PQ_Main {
        static ArrayList<Integer> least3;
    public static void main(String[] args) {
        System.out.println("-demo1---");
        demo1();
        System.out.println("-demo2---");
        demo2();
        
    }
    static void demo1() {
        least3 = new ArrayList<>();
        MyMinHeap_651446 heap = new MyMinHeap_651446();
        heap.insert(11); heap.insert(15);
        heap.insert(16); heap.insert(13);
        heap.insert(17); heap.insert(18);

        // System.out.println("Initial heap structure is " + heap);
        // least3.add(heap.remove());
        // System.out.println("Heap after 1st dequeue: " + heap);
        // least3.add(heap.remove());
        // System.out.println("Heap after 2nd dequeue: " + heap);
        // least3.add(heap.remove());
        // System.out.println("Heap after 3rd dequeue: " + heap);
        // System.out.println("least 3 value is " + least3);

        System.out.println("heap strucutre is " + heap);
        least3.add(heap.remove());
        least3.add(heap.remove());
        least3.add(heap.remove());
        System.out.println("least 3 value is " + least3);
    }
    static void demo2() {
        least3 = new ArrayList<>();
        MyPriorityQueue_651446 pq = new MyPriorityQueue_651446();
        pq.enqueue(11); pq.enqueue(15);
        pq.enqueue(16); pq.enqueue(13);
        pq.enqueue(17); pq.enqueue(18);
        pq.enqueue(19); // <-- isFull() is true ... discard
        System.out.println("pq structure is " + pq);
        least3.add(pq.dequeue());
        least3.add(pq.dequeue());
        least3.add(pq.dequeue());
        System.out.println("least 3 value is " + least3);
    }

    // class Employee {
    //     String name;
    //     int salary;
    
    //     public Employee(String name, int salary) {
    //         this.name = name;
    //         this.salary = salary;
    //     }
    
    //     @Override
    //     public String toString() {
    //         return "Emp " + name + "(" + salary + ")";
    //     }
    // }


        // static void demo_priorityQueue() {
    //     PriorityQueue<Employee> pq = new PriorityQueue<>(
    //         (e1, e2) -> Integer.compare(e1.salary, e2.salary)
    //     );

    //     List<Employee> list = Arrays.asList(
    //         new Employee("Yindee", 2000),
    //         new Employee("Preeda", 1500),
    //         new Employee("Pramote", 3000)
    //     );

    //     pq.addAll(list);
    //     System.out.println(pq);
    // }

}