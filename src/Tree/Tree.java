package Tree;

public class Tree {
    Node root;

    public void insertIntoTree(int value) {
        if (root == null)
            root = new Node(value);
        else
            root.insert(value);
    }

    public void printTreeInOrder() {

        if (root != null)
            root.inOrderTraverse();

    }
    public void printTreePreOrder() {

        if (root != null)
            root.preOrderTraverse();

    }
    public void printTreePostOrder() {

        if (root != null)
            root.postOrderTraverse();

    }

    public Node get(int value) {
        return root.get(value);
    }

    public int getMin() {
        if (root == null)
            return Integer.MIN_VALUE;
        return root.getMin();
    }

    public int getMax() {
        if (root == null)
            return Integer.MAX_VALUE;
        return root.getMax();
    }

    public void delete(int value) {
        {

            Node current = root;
            Node prev = current;
            while (current != null && current.getData() != value) {
                if (value < current.getData()) {
                    prev = current;
                    current = current.getLeft();
                }
                if (value > current.getData()) {
                    prev = current;
                    current = current.getRight();
                }
            }
            if (current.getData() == value) {
                //key == num:
                delete(current, prev);
            }
            if (current == null) {
                System.out.println("not found");
            }

        }
    }

    private void delete(Node current, Node parent) {
        //node is a leaf:
        if (current.getLeft() == null && current.getRight() == null) {
            if (parent.getLeft() == current)
                parent.setLeft(null);
            else if (parent.getRight() == current)
                parent.setRight(null);

        }
        //one child at right
        else if (current.getLeft() == null && current.getRight() != null) {
            if (parent.getLeft() == current)
                parent.setLeft(current.getRight());
            else if (parent.getRight() == current)
                parent.setRight(current.getRight());
        }
        //one child at left
        else if (current.getLeft() != null && current.getRight() == null) {
            if (parent.getLeft() == current)
                parent.setLeft(current.getLeft());
            else if (parent.getRight() == current)
                parent.setRight(current.getLeft());
        }
        //two children:
        else {
            //find rightmost node in left subtree:
            Node t = current.getLeft();
            Node tp = current;
            while (t.getRight() != null) {
                tp = t;
                t = t.getRight();

            }
            //substitute current key and then delete t
            current.setData(t.getData());
            delete(t, tp);
        }
    }

}
