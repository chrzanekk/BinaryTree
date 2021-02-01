import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree = binaryTree.createBinaryTree();
        System.out.println(binaryTree.getLow());
        System.out.println(binaryTree.getHigh());
        System.out.println("Size: " + binaryTree.getSize());
        System.out.println(binaryTree);
        binaryTree.inOrderTraversal();
        binaryTree.preOrderTraversal();
        binaryTree.postOrderTraversal();

    }
}
