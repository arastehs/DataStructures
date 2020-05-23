package Queue.MyQueue;

import LinkedList.mylinkedlist.Employee;

public class CircularArrayQueuDriveTest {
    public static void main(String[] args) {
        CircularArrayQueu myQueue = new CircularArrayQueu(
                4);
        myQueue.add(new Employee("Arian", "namvar", 10));
        myQueue.add(new Employee("Adrina", "namvar", 20));
        myQueue.add(new Employee("sep", "ara", 30));
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());

        myQueue.add(new Employee("vahid", "namvar", 40));
        myQueue.add(new Employee("nahid", "namvar", 50));

        myQueue.printQueue();
        System.out.println("----------------------------------------");


    }

}
