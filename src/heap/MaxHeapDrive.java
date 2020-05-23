package heap;

public class MaxHeapDrive {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(80);
        maxHeap.insert(75);
        maxHeap.insert(60);
        maxHeap.insert(68);
        maxHeap.insert(55);
        maxHeap.insert(40);
        maxHeap.insert(52);
        maxHeap.insert(67);
        maxHeap.insert(90);
        maxHeap.print();
        System.out.println("root is: " + maxHeap.peek());
        System.out.println(maxHeap.delete(1));
        maxHeap.print();
        System.out.println(maxHeap.delete(0));
        maxHeap.print();
        System.out.println("root is: " + maxHeap.peek());
        System.out.println(maxHeap.delete(4));
        maxHeap.sort();
        maxHeap.print();
    }
}
