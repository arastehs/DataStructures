package LinkedList.javalinkedlist;

import LinkedList.mylinkedlist.Employee;

import java.util.LinkedList;
import java.util.List;

public class JDKLinkedList {
    public static void main(String[] args) {
        List javaLikedList = new LinkedList<Employee>();


        ((LinkedList) javaLikedList).addFirst(new Employee("Arian", "namvar", 10));
        ((LinkedList) javaLikedList).addFirst(new Employee("Adrina", "namvar", 20));
        ((LinkedList) javaLikedList).addFirst((new Employee("sep", "ara", 30)));

        System.out.println(javaLikedList);
        ((LinkedList) javaLikedList).addLast(new Employee("vahid","namvar",40));
        System.out.println(javaLikedList);

        ((LinkedList) javaLikedList).removeFirst();
        System.out.println(javaLikedList);

        ((LinkedList) javaLikedList).removeLast();
        System.out.println(javaLikedList);

    }
}
