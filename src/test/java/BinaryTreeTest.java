import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    private BinaryTree binaryTree = BinaryTree.createBinaryTree();

    @Test
    public void testBinaryTreeContainsValueAndValueExists() {

        int value = 5;

        boolean result = binaryTree.containsNode(value);

        assertTrue(result);
    }

    @Test
    public void testBinaryTreeContainsValueAndValueDoesNotExists() {
        int value = 7;

        boolean result = binaryTree.containsNode(value);

        assertFalse(result);
    }

    @Test
    public void testBinaryTreeCalculateSumOfElements() {
        int value = 87;

        int result = binaryTree.calculateSum();

        assertEquals(value,result);
    }
}
