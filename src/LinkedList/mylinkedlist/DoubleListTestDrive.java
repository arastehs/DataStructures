package LinkedList.mylinkedlist;

public class DoubleListTestDrive {
    public static void main(String[] args) {

        //creating a double linked list:
        EmployeeDoubleList doubleList = new EmployeeDoubleList();
        doubleList.addNodeToFront( new Employee("Arian","namvar",10));
        doubleList.addNodeToFront(new Employee("Adrina","namvar",20));
        doubleList.addNodeToFront(new Employee("sep","ara",30));
        doubleList.addNodeToFront(new Employee("vahid","namvar",40));

        System.out.println("List size is: "+doubleList.getSize());

        doubleList.printList();

        System.out.println("**********************************");
        System.out.println("add to the end of the list:");
        doubleList.addNodeToEnd(new Employee("ziba","gholizade",50));

        System.out.println("List size is: "+doubleList.getSize());
        doubleList.printList();

//        System.out.println("searching the list: ");
//        Employee wantToFind = new Employee("Adrina","namvar",20);
//        if(doubleList.contains(wantToFind))
//            System.out.println(wantToFind+ " is in the List");

        System.out.println("removing the node from top of the list:");
        doubleList.removeNodeFromFront();
        System.out.println("List size is: "+doubleList.getSize());
        doubleList.printList();

//        System.out.println("removing a specific node at the middle of the list:");
//        doubleList.removeNode(wantToFind);
//        System.out.println("List size is: "+doubleList.getSize());
//        doubleList.printList();

        System.out.println("removing the node from end of the list:");
        doubleList.removeNodeFromEnd();
        System.out.println("List size is: "+doubleList.getSize());
        doubleList.printList();




    }
}
