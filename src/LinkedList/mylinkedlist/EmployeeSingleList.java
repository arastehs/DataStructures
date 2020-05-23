package LinkedList.mylinkedlist;

public class EmployeeSingleList {
    private EmployeeSingleNode head;
    private int size;

    public EmployeeSingleList() {

    }

    public void addNode(Employee employee) {
        EmployeeSingleNode node = new EmployeeSingleNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeSingleNode removeNodeFromFront() {
        if(isEmpty())
            return null;
        EmployeeSingleNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        System.out.println("----------------------------------------");
        System.out.println("List members:");
        EmployeeSingleNode current = head;
        while (current != null) {

            System.out.println(current);
            current = current.getNext();
        }
        System.out.println("----------------------------------------");

    }
//whether we have the node in list or not:
    public boolean contains(Employee e) {
        EmployeeSingleNode current = head;
        while (current != null) {

            if (current.getEmployee().equals(e))
                return true;
            current = current.getNext();
        }
        return false;
    }
    //if we have the node in the list,return the previous node so that we are able to delete  the specific node
    public EmployeeSingleNode containsNode(Employee e) {
        EmployeeSingleNode current = head;
        EmployeeSingleNode prev = null;
        while (current != null) {

            if (current.getEmployee().equals(e))
                return prev;
            prev = current;
            current = current.getNext();
        }
        return null;
    }

    //remove a node from middle of the list!
    public void removeNode(Employee e) {
        EmployeeSingleNode prev = containsNode(e);
        if(prev!= null){
            prev.setNext(prev.getNext().getNext());
            size--;

        }

    }
}
