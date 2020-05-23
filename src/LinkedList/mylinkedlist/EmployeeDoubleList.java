package LinkedList.mylinkedlist;

public class EmployeeDoubleList {
    private EmployeeDoubleNode head;
    private EmployeeDoubleNode tail;
    private int size;

    public EmployeeDoubleList() {

    }

    public void addNodeToFront(Employee employee) {
        EmployeeDoubleNode node = new EmployeeDoubleNode(employee);

        if (isEmpty())//head and tail is null
        {
            tail = node;

        } else {
            head.setPrev(node);
        }

        node.setNext(head);
        head = node;
        size++;
    }

    public void addNodeToEnd(Employee employee) {
        EmployeeDoubleNode node = new EmployeeDoubleNode(employee);

        if (isEmpty()) {
            head = node;
        }
        else {
            tail.setNext(node);
        }

        node.setPrev(tail);
        tail = node;
        size++;
    }

    public EmployeeDoubleNode removeNodeFromFront() {
        if (isEmpty())
            return null;
        EmployeeDoubleNode removedNode = head;
        if(head.getNext() == null)
            tail=null;
        else
            head.getNext().setPrev(null);

        head = head.getNext();
        removedNode.setNext(null);

        size--;
        return removedNode;
    }

    public EmployeeDoubleNode removeNodeFromEnd() {

        if (isEmpty())
            return null;
        EmployeeDoubleNode removedNode = tail;
        if(tail.getPrev() == null){
            head = null;
        }
        else{
            tail.getPrev().setNext(null);
        }

        tail = tail.getPrev();

        removedNode.setPrev(null);

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
        EmployeeDoubleNode current = head;
        while (current != null) {

            System.out.println(current);
            current = current.getNext();
        }
        System.out.println("----------------------------------------");

    }

    //whether we have the node in list or not:
    public boolean contains(Employee e) {
        EmployeeDoubleNode current = head;
        while (current != null) {

            if (current.getEmployee().equals(e))
                return true;
            current = current.getNext();
        }
        return false;
    }

    //if we have the node in the list,return the previous node so that we are able to delete  the specific node
    public EmployeeDoubleNode containsNode(Employee e) {
        EmployeeDoubleNode current = head;

        while (current != null) {

            if (current.getEmployee().equals(e))
                return current;

            current = current.getNext();
        }
        return null;
    }

    //remove a node from middle of the list!
    public void removeNode(Employee e) {
        EmployeeDoubleNode current = containsNode(e);
        if (current != null) {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            size--;

        }

    }
}
