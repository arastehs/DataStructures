package Queue.JDKQueue;

import LinkedList.mylinkedlist.Employee;

import java.util.LinkedList;

public class JDKQueue {

    LinkedList<Employee> queue;

    public JDKQueue() {

      queue = new LinkedList<>();
    }
    public void add(Employee e){
        queue.addLast(e);

    }
    public Employee remove(){
        return queue.removeFirst();
    }
    public Employee peek(){
       return queue.peekFirst();
    }
    public void printStack(){
        System.out.println(queue);
    }

}
