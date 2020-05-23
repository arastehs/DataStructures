package Stack.JDKStack;

import LinkedList.mylinkedlist.Employee;

public class LinkedStackDriveTest {
    public static void main(String[] args) {
        LinkedStack mystack = new LinkedStack();
        mystack.push(new Employee("Arian", "namvar", 10));
        mystack.push(new Employee("Adrina", "namvar", 20));
        mystack.push(new Employee("sep", "ara", 30));
        mystack.push(new Employee("vahid", "namvar", 40));


        mystack.printStack();
        System.out.println("----------------------------------------");

        mystack.push(new Employee("nahid", "namvar", 50));
        mystack.push(new Employee("majid", "namvar", 60));
        mystack.printStack();
        System.out.println("----------------------------------------");


        System.out.println(mystack.pop());

        System.out.println(mystack.peek());

        System.out.println(mystack.pop());
        System.out.println(mystack.pop());

        System.out.println(mystack.peek());
        mystack.printStack();

    }

}
