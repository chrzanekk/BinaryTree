import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    BinaryTree binaryTree = new BinaryTree();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testBinaryTreeContainsValueAndValueExists() {
        binaryTree = binaryTree.createBinaryTree();
        int value = 5;

        boolean result = binaryTree.containsNode(value);

        assertTrue(result);
    }

    @Test
    public void testBinaryTreeContainsValueAndValueDoesNotExists() {
        binaryTree = binaryTree.createBinaryTree();
        int value = 7;

        boolean result = binaryTree.containsNode(value);

        assertFalse(result);
    }

    @Test
    public void testBinaryTreeCalculateSumOfElements() {
        binaryTree = binaryTree.createBinaryTree();
        int value = 77;

        int result = binaryTree.calculateSum(binaryTree.getRoot());

        assertEquals(value,result);
    }
}
