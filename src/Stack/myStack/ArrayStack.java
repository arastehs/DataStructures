package Stack.myStack;

import LinkedList.mylinkedlist.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public Employee[] getStack() {
        return stack;
    }

    public int size() {
        return top;
    }

    public void push(Employee employee) {
        //if stack is full double the size
        int size = stack.length;
        if(top== size)
        {
           // System.out.println("Stack is full");
            Employee[] newArray = new Employee[size*2];
            System.arraycopy(stack,0,newArray,0,size);
            stack = newArray;
        }

        stack[top++]=employee;

    }
    public Employee pop(){
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        Employee e = stack[--top];
        stack[top] = null;
        return e;
    }
    public Employee peek(){
        if(top==0)
        {
            throw new EmptyStackException();
        }

        return stack[top-1];
    }
    public boolean isEmpty(){
        return top ==0;
    }

    public void printStack()
    {
        for (int i=top-1; i>=0; i--)
            System.out.println(stack[i]);
    }

}
