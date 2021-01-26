

public class BinaryTree {
    private Node root;
    private int value;
    private int size = 0;

    public BinaryTree() {
        root = new Node(value);
    }

    public Node getRoot() {
        return root;
    }

    public void add(int value) {
        if (size == 0) {
            root.value = value;
            size++;
        } else {
            addRecursive(root, new Node(value));
        }
    }

    public int getSize() {
        return size;
    }

    private void addRecursive(Node root, Node newNode) {
        if (root == null) {
            return;
        }
        if (newNode.value < root.value) {
            if (root.leftNode == null) {
                root.leftNode = newNode;
                size++;
            } else {
                addRecursive(root.leftNode, newNode);
            }
        } else {
            if (root.rightNode == null) {
                root.rightNode = newNode;
                size++;
            } else {
                addRecursive(root.rightNode, newNode);
            }
        }
    }


    public BinaryTree createBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
        binaryTree.add(10);
        binaryTree.add(15);
        binaryTree.add(9);
        binaryTree.add(25);
        binaryTree.add(11);
        binaryTree.add(2);
        return binaryTree;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }

        return value < current.value
                ? containsNodeRecursive(current.leftNode, value)
                : containsNodeRecursive(current.rightNode, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public int getLow() {
        Node currentNode = root;

        while (currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }

        return currentNode.value;
    }

    public int getHigh() {
        Node currentNode = root;

        while (currentNode.rightNode != null) {
            currentNode = currentNode.rightNode;
        }

        return currentNode.value;
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftNode);
            System.out.println(node.value + " ");
            inOrder(node.rightNode);
        }
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            System.out.println(node.value + " ");
        }
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.value + " ");
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }
    }

    public void preOrderTraversal() {
        System.out.println("Preorder traversal->");
        preOrder(root);
        System.out.println();
    }

    public void postOrderTraversal() {
        System.out.println("Postorder traversal->");
        postOrder(root);
        System.out.println();
    }

    public void inOrderTraversal() {
        System.out.println("Inorder traversal->");
        inOrder(root);
        System.out.println();
    }

    public String toString() {
        Node currentNode = root;
        System.out.println("Traverse from left ");
        while (currentNode.leftNode != null && currentNode.rightNode != null) {
            System.out.println(currentNode.value + "->[" + currentNode.leftNode.value + " " + currentNode.rightNode.value + "] ");
            currentNode = currentNode.leftNode;
        }

        System.out.println();
        System.out.println("Traverse from right ");
        currentNode = root;

        while (currentNode.leftNode != null && currentNode.rightNode != null) {
            System.out.println(currentNode.value + "->[" + currentNode.leftNode.value + " " + currentNode.rightNode.value + "] ");
            currentNode = currentNode.rightNode;
        }
        return "";
    }

    public int calculateSum(Node node) {
        int sum = 0;
        int sumLeftNode = 0;
        int sumRightNode = 0;
                if (root == null) {
            return 0;
        } else {
            if (node.leftNode != null) {
                sumLeftNode = calculateSum(node.leftNode);
            }
            if (node.rightNode != null) {
                sumRightNode = calculateSum(node.rightNode);
            }
        }
        sum = node.value + sumLeftNode + sumRightNode;
        return sum;
    }

    class Node {
        private int value;
        private Node leftNode;
        private Node rightNode;

        Node(int value) {
            this.value = value;
            leftNode = null;
            rightNode = null;
        }
    }
}
