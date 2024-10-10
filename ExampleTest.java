import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testFunctionA_PositiveY() {
        Example example = new Example(3, 4);  // Initialize with example values
        int result = example.Function_A(5);   // Test for positive y
        assertEquals(8, result);              // Expected result is 5 + 3 = 8
    }

    @Test
    public void testFunctionA_NegativeY() {
        Example example = new Example(3, 4);  // Initialize with example values
        int result = example.Function_A(-5);  // Test for negative y
        assertEquals(-8, result);             // Expected result is -5 - 3 = -8
    }

    @Test
    public void testFunctionB_XLessThan6() {
        Example example = new Example(3, 4);  // Initialize with example values
        int result = example.Function_B(4);   // Test for x < 6
        assertEquals(8, result);              // Expected result is 4 + 4 = 8
    }

    @Test
    public void testFunctionB_XGreaterOrEqual6() {
        Example example = new Example(3, 4);  // Initialize with example values
        int result = example.Function_B(7);   // Test for x >= 6
        assertEquals(3, result);              // Expected result is 7 - 4 = 3
    }
}
