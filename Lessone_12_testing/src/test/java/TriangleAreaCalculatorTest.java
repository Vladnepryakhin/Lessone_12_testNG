import org.example.TriangleArea;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaCalculatorTest {
    private TriangleArea TriangleAreaCalculator;

    @Test
    public void testValidArea() {
        assertEquals(TriangleAreaCalculator.calculateArea(5, 4), 10.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroBase() {
        TriangleAreaCalculator.calculateArea(0, 4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHeight() {
        TriangleAreaCalculator.calculateArea(5, -4);
    }
}