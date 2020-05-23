package Queue.MyQueue;

import LinkedList.mylinkedlist.Employee;

import java.util.NoSuchElementException;

public class CircularArrayQueu {
    private Employee[] queue;
    private int front;
    private int back;

    public CircularArrayQueu(int capacity) {
        queue = new Employee[capacity];
    }

    public Employee[] getQueue() {
        return queue;
    }

    public int getFront() {
        return front;
    }

    public int size() {

        if (front <= back) {
            return back - front;
        }
        return back - front + queue.length;
    }

    public void add(Employee employee) {
        //if stack is full double the size

        if (size() == queue.length-1 ) {
            // System.out.println("Stack is full");
            int numItems = size();
            Employee[] newArray = new Employee[queue.length * 2];

                System.arraycopy(queue, front, newArray, 0, queue.length - front);
                System.arraycopy(queue,0,newArray, queue.length - front, back);

            queue = newArray;
            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if (back < queue.length-1) {
            back++;
        }
        else {
            back = 0;
        }

    }

    public Employee remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Employee e = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) //front and back reached each other
        {
            front = 0;
            back = 0;
        }
        else if (front == queue.length)
            front = 0;
        return e;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void printQueue() {
        if (back >= front) {
            for (int i = front; i < back; i++) {

                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {

                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {

                System.out.println(queue[i]);
            }
        }
    }

}
