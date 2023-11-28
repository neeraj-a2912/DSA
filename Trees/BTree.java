import java.util.Scanner;

public class BTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display(); 
    }
}

class BinaryTree {
    
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter the root Node: ");
        int data = scanner.nextInt();
        root = new Node(data);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.data);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.data);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.data);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.data);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "->");
    }
    
    private void display(Node node, String indent) {

        if (node != null) {
            return;
        }

        System.out.println(indent + node.data);
        display(node.left,indent);
        display(node.right,indent+"\t");

    }
}