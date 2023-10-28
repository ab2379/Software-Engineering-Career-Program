import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void testEmptyArray(){
        int[] emptyArray = {};
        boolean result = W03_ContainsDuplicate.containsDuplicate(emptyArray);
        assertFalse(result);
    }

    @Test
    public void testOneElementArray(){
        int[] oneArray = {1};
        boolean result = W03_ContainsDuplicate.containsDuplicate(oneArray);
        assertFalse(result);
    }

    @Test
    public void testOnlyOneDuplicate(){
        int[] oneDuplicateArray = {1, 1, 2, 3, 4};
        boolean result = W03_ContainsDuplicate.containsDuplicate(oneDuplicateArray);
        assertTrue(result);
    }

    @Test
    public void testMultipleDuplicates(){
        int[] multipleDuplicateArray = {1, 1, 2, 2, 4};
        boolean result = W03_ContainsDuplicate.containsDuplicate(multipleDuplicateArray);
        assertTrue(result);
    }
}
