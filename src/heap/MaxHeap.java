package heap;

public class MaxHeap {

    private int[] heap;
    private int size; // it will be the actual size of the heap, with each insert, it will eb increased by one
    //and with every delete it shoud be decreased by one to remain updated

    public MaxHeap(int capacity) {
        heap = new int[capacity];
    }

    private boolean isFull() {
        return size == heap.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is empty");
        return heap[0];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");

        }
        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");

        }
        int valueToDelete = heap[index];
        heap[index] = heap[size - 1];
        heap[size - 1] = 0;
        size--;

        if (index == 0 || heap[index] < heap[getParent(index)])
            fixHeapBelow(index, size - 1);
        else
            fixHeapAbove(index);

        //size--;

        return valueToDelete;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {

        int indexToSwap;

        while (index <= lastHeapIndex) {
            int leftChildIndex = getChild(index, true);
            int rightChildIndex = getChild(index, false);

            if (rightChildIndex <= lastHeapIndex) //it has both left and right child because tree is complete

                indexToSwap = heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex;
            else if (leftChildIndex <= lastHeapIndex)
                indexToSwap = leftChildIndex;
            else
                break;

            if (heap[index] < heap[indexToSwap]) {
                int tmp = heap[index];
                heap[index] = heap[indexToSwap];
                heap[indexToSwap] = tmp;

            }
            index = indexToSwap;

        }
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    //Time Complexity: O(nlogn)
    public void sort() {
        int lastHeapIndex = size - 1;
        for (int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;

            fixHeapBelow(0, lastHeapIndex - i - 1);

        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(",   ");
        }
        System.out.println();

    }
}
