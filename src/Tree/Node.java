package Tree;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }
        if (value < data) {
            if (left == null)
                left = new Node(value);
            else
                left.insert(value);
        } else {
            if (right == null)
                right = new Node(value);
            else
                right.insert(value);
        }
    }

    public void inOrderTraverse() {

        if (left != null)
            left.inOrderTraverse();

        System.out.print(data + "  ");
        if (right != null)
            right.inOrderTraverse();
    }

    public void preOrderTraverse() {

        System.out.print(data + "  ");

        if (left != null)
            left.preOrderTraverse();

        if (right != null)
            right.preOrderTraverse();
    }

    public void postOrderTraverse() {

        if (left != null)
            left.postOrderTraverse();

        if (right != null)
            right.postOrderTraverse();

        System.out.print(data + "  ");
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (left != null)
                return left.get(value);
        } else {
            if (right != null)
                return right.get(value);
        }
        return null;
    }

    public int getMin() {
        if (left == null)
            return data;
        return left.getMin();
    }

    public int getMax() {
        if (right == null)
            return data;
        return right.getMax();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
