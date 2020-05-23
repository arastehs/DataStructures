package Stack.myStack;

import LinkedList.mylinkedlist.Employee;

public class ArrayStackDriveTest {
    public static void main(String[] args) {
        ArrayStack mystack = new ArrayStack(4);
        mystack.push(new Employee("Arian", "namvar", 10));
        mystack.push(new Employee("Adrina", "namvar", 20));
        mystack.push(new Employee("sep", "ara", 30));
        mystack.push(new Employee("vahid", "namvar", 40));

        System.out.println("top index is: " + mystack.size());
        mystack.printStack();
        System.out.println("----------------------------------------");

        mystack.push(new Employee("nahid", "namvar", 50));
        mystack.push(new Employee("majid", "namvar", 60));
        mystack.printStack();
        System.out.println("----------------------------------------");


        System.out.println(mystack.pop());
        System.out.println("1 obj poped, top index is: " + mystack.size());
        System.out.println("----------------------------------------");


        System.out.println(mystack.peek());
        System.out.println("1 obj peeked, top index is: " + mystack.size());
        System.out.println("----------------------------------------");

        //to get an exception:
        for (int i = 0; i < 7; i++)
            System.out.println("poped one obj, " + mystack.pop());

        System.out.println(mystack.peek());

    }

}
