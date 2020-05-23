package LinkedList.mylinkedlist;



public class SingleListTestDrive {
    public static void main(String[] args) {

        //creating a linked list:
        EmployeeSingleList employeesingleList = new EmployeeSingleList();
        employeesingleList.addNode( new Employee("Arian","namvar",10));
        employeesingleList.addNode(new Employee("Adrina","namvar",20));
        employeesingleList.addNode(new Employee("sep","ara",30));
        employeesingleList.addNode(new Employee("vahid","namvar",40));

        System.out.println("List size is: "+employeesingleList.getSize());
        employeesingleList.printList();

        System.out.println("searching the list: ");
        Employee wantToFind = new Employee("Adrina","namvar",20);
        if(employeesingleList.contains(wantToFind))
            System.out.println(wantToFind+ " is in the List");

        System.out.println("removing the node from top of the list:");
        employeesingleList.removeNodeFromFront();
        System.out.println("List size is: "+employeesingleList.getSize());
        employeesingleList.printList();

        System.out.println("removing a specific node at the middle of the list:");
        employeesingleList.removeNode(wantToFind);
        System.out.println("List size is: "+employeesingleList.getSize());
        employeesingleList.printList();




    }
}
