package Queue.MyQueue;

import LinkedList.mylinkedlist.Employee;

import java.util.NoSuchElementException;

public class ArrayQueu {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueu(int capacity) {
        queue = new Employee[capacity];
    }

    public Employee[] getQueue() {
        return queue;
    }

    public int getFront() {
        return front;
    }

    public int size() {
        return back-front;
    }

    public void add(Employee employee) {
        //if stack is full double the size
        int size = queue.length;
        if(back== size)
        {
           // System.out.println("Stack is full");
            Employee[] newArray = new Employee[size*2];
            System.arraycopy(queue,0,newArray,0,size);
            queue = newArray;
        }

        queue[back++]=employee;

    }
    public Employee remove(){
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        Employee e = queue[front];
        queue[front] = null;
      front++;
      if(size()==0) //front and back reached each other
      {
          front = 0;
          back = 0;
      }
        return e;
    }
    public Employee peek(){
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }
    public boolean isEmpty(){
        return size() ==0;
    }

    public void printQueue()
    {
        for (int i=front; i<back; i++)
            System.out.println(queue[i]);
    }

}
