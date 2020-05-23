package Queue.JDKQueue;

import LinkedList.mylinkedlist.Employee;

public class JDKQueuDriveTest {
    public static void main(String[] args) {
        JDKQueue myQueue = new JDKQueue();
        myQueue.add(new Employee("Arian", "namvar", 10));
        myQueue.add(new Employee("Adrina", "namvar", 20));
        myQueue.add(new Employee("sep", "ara", 30));
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());

        myQueue.add(new Employee("vahid", "namvar", 40));
        myQueue.add(new Employee("nahid", "namvar", 50));

        System.out.println("----------------------------------------");
        myQueue.printStack();


    }

}
