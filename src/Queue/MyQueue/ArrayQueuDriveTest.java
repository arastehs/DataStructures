package Queue.MyQueue;

import LinkedList.mylinkedlist.Employee;

public class ArrayQueuDriveTest {
    public static void main(String[] args) {
        ArrayQueu myQueue = new ArrayQueu(4);
        myQueue.add(new Employee("Arian", "namvar", 10));
        myQueue.add(new Employee("Adrina", "namvar", 20));
        myQueue.add(new Employee("sep", "ara", 30));
        myQueue.add(new Employee("vahid", "namvar", 40));

        System.out.println("top index is: " + myQueue.size());
        myQueue.printQueue();
        System.out.println("----------------------------------------");

        myQueue.add(new Employee("nahid", "namvar", 50));
        myQueue.add(new Employee("majid", "namvar", 60));
        myQueue.printQueue();
        System.out.println("----------------------------------------");


        System.out.println(myQueue.remove());
        System.out.println("1 obj poped, top index is: " + myQueue.size());
        System.out.println("----------------------------------------");


        System.out.println(myQueue.peek());
        System.out.println("1 obj peeked, top index is: " + myQueue.size());
        System.out.println("----------------------------------------");

        System.out.println(myQueue.getFront());
        System.out.println(myQueue.size());
        //to get an exception:
        for (int i = 0; i < 5; i++)
            System.out.println("poped one obj, " + myQueue.remove());

        //System.out.println(myQueue.peek());

    }

}
