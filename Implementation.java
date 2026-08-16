class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Implementation {

    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        // Creating the binary tree
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        // Display tree
        display(a);

        // Size
        System.out.println("Size = " + size(a));

        // Sum
        System.out.println("Sum = " + sum(a));

        // Maximum value
        System.out.println("Maximum = " + max(a));
    }

    // Preorder: Root -> Left -> Right
    public static void display(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");

        display(root.left);
        display(root.right);
    }

    // Count number of nodes
    public static int size(Node root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }

    // Calculate sum of all nodes
    public static int sum(Node root) {
        if (root == null)
            return 0;

        return root.val + sum(root.left) + sum(root.right);
    }

    // Find maximum value
    public static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(
            root.val,
            Math.max(max(root.left), max(root.right))
        );
    }
}