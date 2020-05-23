package Tree;

public class main {
    public static void main(String[] args) {


        Tree tree = new Tree();
        tree.insertIntoTree(25);
        tree.insertIntoTree(20);
        tree.insertIntoTree(15);
        tree.insertIntoTree(27);
        tree.insertIntoTree(30);
        tree.insertIntoTree(29);
        tree.insertIntoTree(26);
        tree.insertIntoTree(22);
        tree.insertIntoTree(32);
        tree.insertIntoTree(17);

        tree.printTreePreOrder();
        System.out.println("\n----------------------------");
        tree.printTreeInOrder();
        System.out.println("\n----------------------------");
        tree.printTreePostOrder();
        System.out.println("\n----------------------------");
//        System.out.println("min is: "+ tree.getMin());
//        System.out.println("max is: "+ tree.getMax());
//        System.out.println(tree.get(12).getData());
        tree.delete(27);
        tree.printTreeInOrder();
    }
}
