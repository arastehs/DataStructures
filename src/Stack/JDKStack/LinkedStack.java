package Stack.JDKStack;

import LinkedList.mylinkedlist.Employee;

import java.util.LinkedList;

public class LinkedStack {
    LinkedList<Employee> stack;


    public LinkedStack() {
       stack = new LinkedList<Employee>();
    }
    public void push(Employee employee){
        stack.push(employee);
    }
    public Employee pop(){
        return stack.pop();
    }
    public  Employee peek(){
        return stack.peek();
    }
    public  boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public void printStack(){
        System.out.println(stack);
    }
}
